// dont fuck with my love
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

public class Main
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            } catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static int modPower(int x, int y, int mod){
        int res = 1;
        x %= mod;
        if(x==0) return 0;
        while(y>0){
            if(y%2==1){
                res = (res*x)%mod;
            }
            y = y>>1;
            x = (x*x)%mod;
        }
        return res;
    }
    public static int[] readArray(int n){
        FastReader in = new FastReader();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }
    static class pair{
        int first, second;
        pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        FastReader in = new FastReader();
        String s = in.nextLine(), t = in.nextLine();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= s.length() - t.length(); i++) {
            int c = 0;
            for(int j = 0; j < t.length(); j++) {
                if(s.charAt(j+i) != t.charAt(j)) c++;
            }
            ans = Math.min(c, ans);
        }
        System.out.println(ans);
    }
}
