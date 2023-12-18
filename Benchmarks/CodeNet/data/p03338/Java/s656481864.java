

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        Map<Character, Integer[]> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (map.containsKey(s[i])) {
                Integer[] range = map.get(s[i]);
                range[1] = Math.max(range[1], i);
            } else {
                map.put(s[i], new Integer[]{i, Integer.MIN_VALUE});
            }
        }
        int max = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Map.Entry<Character, Integer[]> item : map.entrySet()) {
            Integer[] range = item.getValue();
            if (range[0] > range[1]) {
                continue;
            }
            for (int i = range[0]; i <= range[1]; i++) {
                int count = countMap.getOrDefault(i, 0) + 1;
                countMap.put(i, count);
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}
