import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i=0; i<num; i++) {
            list.add(sc.next());
        }

        int count = 0;

        for (int i=0; i<num; i++) {
            String input = list.get(i);
            for (int j=i+1; j<num; j++) {
                String target = list.get(j);
                if (isAnagram(input, target)) count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isAnagram(String input, String target) {
        if (input.length() != target.length()) return false;

        Map<String, Integer> inputEachCharMap = countMap(input);
        Map<String, Integer> targetEachCharMap = countMap(target);

        for (String key: inputEachCharMap.keySet()) {
            if (!targetEachCharMap.containsKey(key)) return false;

            if (!targetEachCharMap.get(key).equals(inputEachCharMap.get(key))) return false;
        }

        return true;
    }

    public static Map<String, Integer> countMap(String str) {
        char[] charArray = str.toCharArray();
        Map<String, Integer> map = new HashMap<>();

        for (char c: charArray) {
            String s = String.valueOf(c);
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        return map;
    }
}
