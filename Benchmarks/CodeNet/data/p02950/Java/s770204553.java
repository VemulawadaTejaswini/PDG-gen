import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        int p = n;

        long[] ans = new long[n];
        for(int i=1; i<p; i++) {
          long pow = 1;
          for(int j=p-1; j>=1; j--) {

            ans[j] += 1L*(-1*pow+p)*a[i];
            ans[j] += p;
            ans[j] %= p;
            pow = (pow*i) % p;
          }
        }

          ans[p-1] += 1L*(p-1)*a[0];
          ans[p-1] %= p;
          ans[0] += 1L*a[0];
          ans[0] %= p;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append(ans[i]+ " ");
        out.println(sb.toString());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
    public static int exp(int base, int e, int mod) {
      if(e == 0) return 1;
      if(e == 1) return base;
      int val = exp(base, e/2, mod);
      int ans = (int)(1L*val*val % mod);
      if(e % 2 == 1)
        ans = (int)(1L*ans*base % mod);
      return ans;
    }
    public static int inv(int base, int mod) {
      return exp(base, mod-2, mod);
    }
}
