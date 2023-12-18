import java.awt.*;
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        char s[]=sc.next().toCharArray();
        int sum[][]=new int[3][n+1];
        for (int i=n-1;i>=0;i--){
            sum[0][i]=sum[0][i+1]+(s[i]=='R'?1:0);
            sum[1][i]=sum[1][i+1]+(s[i]=='G'?1:0);
            sum[2][i]=sum[2][i+1]+(s[i]=='B'?1:0);
        }
        long ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (s[i]!=s[j]){
                    int k=2*j-i;
                    if ((s[i]=='B' && s[j]=='R') || (s[i]=='R' && s[j]=='B')){
                        if (k>=n){
                            ans+=sum[1][j+1];
                        }else if (s[k]=='G')ans+=sum[1][j+1]-1;
                        else ans+=sum[1][j+1];
                    }
                    if ((s[i]=='G' && s[j]=='R') || (s[i]=='R' && s[j]=='G')){
                        if (k>=n){
                            ans+=sum[2][j+1];
                        }else if (s[k]=='B')ans+=sum[2][j+1]-1;
                        else ans+=sum[2][j+1];
                    }
                    if ((s[i]=='B' && s[j]=='G') || (s[i]=='G' && s[j]=='B')){
                        if (k>=n){
                            ans+=sum[0][j+1];
                        }else if (s[k]=='R')ans+=sum[0][j+1]-1;
                        else ans+=sum[0][j+1];
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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