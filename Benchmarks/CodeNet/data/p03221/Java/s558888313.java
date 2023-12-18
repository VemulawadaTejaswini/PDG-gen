

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Long>> map = new HashMap<>();
        int[] p = new int[m];
        long[] y = new long[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextLong();
            if (!map.containsKey(p[i])) {
                map.put(p[i], new ArrayList<>());
            }
            map.get(p[i]).add(y[i]);
        }
        for (Map.Entry<Integer, List<Long>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
        }
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%06d", p[i]) + String.format("%06d", map.get(p[i]).indexOf(y[i]) + 1));
        }
    }
}
