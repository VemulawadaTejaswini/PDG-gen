import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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

            Arrays.sort(a);
            
            Long ans = Long.parseUnsignedLong("1");
            for (long i : a) {
                if ((int) Math.ceil(Math.log10(ans)) + (int) Math.ceil(Math.log10(i)) > 18) {
                    System.out.println(-1);
                    return;
                }
                ans *= i;
            }
            
            if (ans > (long) 1e18) ans = -1L;
            System.out.println(ans);

        }
    }
}