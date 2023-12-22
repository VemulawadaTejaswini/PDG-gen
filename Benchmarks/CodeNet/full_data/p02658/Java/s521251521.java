import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());
            String[] in = br.readLine().split(" ");
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in[i]);
            }

            br.close();

            Long ans = Long.parseUnsignedLong("1");
            for (long i : a) {
                if (i == 0) {
                    System.out.println(0);
                    return;
                }
                ans *= i;
                if (ans > (long) 1e18 || ans == 0) {
                    System.out.println(-1);
                    return;
                }
            }

            System.out.println(ans);

        }
    }
}