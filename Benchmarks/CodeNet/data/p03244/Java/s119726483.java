import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(sc.next());
        }

        Map<Integer, Integer> oddMap = new HashMap<>();
        Map<Integer, Integer> evenMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                evenMap.put(v[i], evenMap.getOrDefault(v[i], 0) + 1);
            } else {
                oddMap.put(v[i], oddMap.getOrDefault(v[i], 0) + 1);
            }
        }

        int[][] odd = oneTwo(oddMap);
        int[][] even = oneTwo(evenMap);

        int res = Integer.MAX_VALUE;
        if (odd[0][0] != even[0][0]) {
            res = Math.min(res, (n / 2) - odd[0][1] + (n / 2) - even[0][1]);
        } else {
            res = Math.min(res, (n / 2) - odd[0][1] + (n / 2) - even[1][1]);
            res = Math.min(res, (n / 2) - odd[1][1] + (n / 2) - even[0][1]);
        }

        System.out.println(res);

    }

    private static int[][] oneTwo(Map<Integer, Integer> map) {
        int max[] = new int[2];
        int two[] = new int[2];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            int k = entry.getKey();
            if (max[1] < v) {
                two[0] = max[0];
                two[1] = max[1];
                max[0] = k;
                max[1] = v;
            } else if (two[1] < v) {
                two[0] = k;
                two[1] = v;
            }
        }
        int[][] res = new int[2][2];
        res[0] = max;
        res[1] = two;
        return res;
    }
}
