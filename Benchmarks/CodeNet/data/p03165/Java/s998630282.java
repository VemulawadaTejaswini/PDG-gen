import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dpf {

	public static void main(String[] args) {

		FastReader sc = new FastReader(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		String [][] dp = new String [s1.length()+1][s2.length()+1];
		
		for (int i=0; i<=s1.length(); i++) {
			for (int j=0; j<=s2.length(); j++) {
				if (i == 0 || j == 0)
					dp[i][j] = "";
				else if (s1.charAt(i-1) == s2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1);
				else
					dp[i][j] = dp[i-1][j].length() > dp[i][j-1].length() ? dp[i-1][j] : dp[i][j-1];
			}
		}
		
		System.out.println(dp[s1.length()][s2.length()]);
		
	}
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream I) {
            br = new BufferedReader(new InputStreamReader(I));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}