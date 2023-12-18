import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        List<String> strList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            strList.add(scan.next());
        }
        scan.close();

        List<Map<Character, Integer>> ans = new ArrayList<>();
        for (String str : strList) {
            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            ans.add(map);
        }

        long number = 0;
        for (int i = 0; i < ans.size(); i++) {
            for (int j = i + 1; j < ans.size(); j++) {
                if (ans.get(i).equals(ans.get(j))) {
                    number++;
                }
            }
        }
        System.out.println(String.valueOf(number));
    }

}
