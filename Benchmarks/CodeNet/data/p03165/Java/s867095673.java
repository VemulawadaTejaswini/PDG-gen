
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int c=0;
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



    public static void main(String[] args)throws IOException {
        FastReader fr = new FastReader();
       char s[]=fr.nextLine().toCharArray();
       char t[]=fr.nextLine().toCharArray();
       String dp[][]=new String[s.length+1][t.length+1];
       for(int i=0;i<s.length+1;i++)
           dp[i][0]="";
       for(int i=0;i<t.length+1;i++)
           dp[0][i]="";
       String ans="";
       for(int i=1;i<s.length+1;i++) {
           for (int j = 1; j < t.length+1; j++)
           {

               if(s[i-1]==t[j-1])
               {
                   dp[i][j]=dp[i-1][j-1]+s[i-1];
//                   ans+=s[i-1];
               }
               else {
                   dp[i][j]=dp[i-1][j].length()>dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
               }

           }

       }

        System.out.println(dp[s.length][t.length]);

    }




}
