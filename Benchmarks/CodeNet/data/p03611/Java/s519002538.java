import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i =  0; i < n ; i++ ) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0 ; i < n ; i++) {
            b[i] = a[i] + 1;
            c[i] = a[i] - 1;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < n ; i++) {
            if (map.containsKey(map.get(a[i]))) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            if (map.containsKey(map.get(b[i]))) {
                map.put(b[i], map.get(b[i]) + 1);
            } else {
                map.put(b[i], 1);
            }
            if (map.containsKey(map.get(c[i]))) {
                map.put(c[i], map.get(c[i]) + 1);
            } else {
                map.put(c[i], 1);
            }
        }
        int ans = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            ans = Math.max(ans, entry.getValue());
        }
        System.out.println(ans);
    }

}