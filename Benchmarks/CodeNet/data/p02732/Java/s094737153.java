import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> hm = new HashMap();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (hm.get(a[i]) == null) {
                hm.put(a[i], 1);
            }
            else {
                hm.put(a[i], hm.get(a[i]) + 1);
            }
        }
        long sum = 0;
        for( int key : hm.keySet()) {
            int tmp = hm.get(key);
            if (tmp < 2) continue;
            sum += (tmp * (tmp - 1)) / 2;
        }

        for (int ansIndex = 0; ansIndex < n; ansIndex++) {
            long ans = sum;
            int tmp = hm.get(a[ansIndex]);
            ans = ans - (tmp * (tmp - 1) / 2) + ((tmp - 1) * (tmp - 2) / 2);
            System.out.println(ans);
        }
    }
}