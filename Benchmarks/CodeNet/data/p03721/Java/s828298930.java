import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int x = Math.abs(1-9);
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+b[i]);
            } else {
                map.put(a[i], b[i]);
            }
        }
        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        int num = 0;
        for (Integer nKey : map.keySet()) {
            num += map.get(nKey);
            if (num >= k) {
                System.out.println(nKey);
                return;
            }
        }
    }
}