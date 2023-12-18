import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        final int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < (1<<n); i++) {
            String bs = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(" ", "0");
            char[] cs = bs.substring(bs.length()- n).toCharArray();
            int vt = 0;
            int ct = 0;
            for (int j = 0; j < n; j++) {
                vt += cs[j] == '1' ? v[j] : 0;
                ct += cs[j] == '1' ? c[j] : 0;
            }
            ans = Math.max(ans, vt - ct);
        }

        System.out.println(ans);
    }
}
