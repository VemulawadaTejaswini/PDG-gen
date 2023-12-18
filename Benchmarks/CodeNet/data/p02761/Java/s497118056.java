import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        int key;
        int value;
        for (int i = 0; i < m; i++) {
            key = sc.nextInt();
            value = sc.nextInt();
            if ((maps.containsKey(key) && maps.get(key) != value) || (key == 1 && value == 0)) {
                System.out.println(-1);
                return;
            }
            maps.put(key, value);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
            if (map.getKey() == 1) {
                ans += map.getValue()*100;
            } else if (map.getKey() == 2) {
                ans += map.getValue()*10;
            } else if (map.getKey() == 3) {
                ans += map.getValue()*1;
            }
        }
        System.out.println(ans);
    }

}
