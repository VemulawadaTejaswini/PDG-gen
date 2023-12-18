
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        boolean[] took = new boolean[n];
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]= in.nextInt();
        }
        int l = 0;
        int r = n - 1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long mx = 0;
            boolean left = true;
            int who = -1;
            for (int j = 0; j < n; j++) {
                if (took[j])
                    continue;
                long v = a[j];
                long dr = Math.abs(r - j);
                long dl = Math.abs(j - l);
                if (v * 1l * dr > mx) {
                    mx = v * 1l * dr;
                    left = false;
                    who = j;
                }
                if ( v * 1l * dl > mx) {
                    mx = v * 1l * dl;
                    left = true;
                    who = j;
                }
            }
            if (mx != 0) {
                took[who] = true;
                ans += mx;
                if (left) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        out.println(ans);
        out.close();
    }
}