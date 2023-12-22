import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            mp.put(a[i], 1);
        }
        int q = scan.nextInt();
        int ans = 0;
        while (q > 0) {
            final int s = scan.nextInt();
            if(mp.containsKey(s)) ans++;
            q--;
        }
        System.out.println(ans);
    }
}
