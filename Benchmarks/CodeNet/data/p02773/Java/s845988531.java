import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i ++){
            String str = scan.next();
            if (map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        int max = 0;
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> s1, Map.Entry<String, Integer> s2) {
                if (s1.getValue().equals(s2.getValue()))
                    return s1.getKey().charAt(0) - s2.getKey().charAt(0);
                return s2.getValue().compareTo(s1.getValue());
            }
        });
        max = list.get(0).getValue();
        for (Map.Entry<String, Integer> stringIntegerEntry : list) {
            if (stringIntegerEntry.getValue() == max)
                System.out.println(stringIntegerEntry.getKey());
            else
                return;
        }
    }
}
