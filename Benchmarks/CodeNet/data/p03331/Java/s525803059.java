import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class Fast {
        BufferedReader br;
        StringTokenizer st;

        public Fast() {
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

    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n=in.nextInt();
        int a=n-1,b=1;
        int ans=(int)1e9;
        while(a>=b){
            ans=Math.min(dif(a)+dif(b),ans);
            a--;
            b++;
        }
        System.out.println(ans);
    }
    static int dif(int a){
        int ans=0;
        while(a>0){
            int x=a%10;
            ans+=x;
            a=a/10;
        }
        return ans;
    }
}




