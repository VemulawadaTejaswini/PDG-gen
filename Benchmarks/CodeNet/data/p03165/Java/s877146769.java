import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        //out.println("AMAN");
        String s1 = sc.next(),s2=sc.next();
        int n = s1.length(), m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<m+1;j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        ArrayList<Character> ch = new ArrayList<>();
        int i=n,j=m;
        while(i!=0 && j!=0) {
            if(dp[i][j]==dp[i-1][j]) --i;
            else if(dp[i][j]==dp[i][j-1]) --j;
            else {
                ch.add(s1.charAt(i - 1));
                --i;
                --j;
            }
        }
        for(i=ch.size()-1;i>=0;i--) {
            out.print(ch.get(i));
        }
        out.flush();
        out.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}