// Born Sinner
// old but im not that old
// fuck all you hoes get a grip
import java.util.*;
import java.lang.*;
import java.io.*;

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
    static class pair<T1, T2>{
        T1 first;
        T2 second;
        pair(T1 first, T2 second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        int t = 1;
        //t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), k = in.nextInt();
            long[] a = new long[n];
            a[0] = in.nextLong();
            for(int i = 1; i < n; i++){
                long x = in.nextLong();
                a[i] = x*a[i-1];
            }
            List<Long> l = new ArrayList<>();
            l.add(a[k-1]);
            for(int i = k; i < n; i++){
                l.add(a[i]/a[i-k]);
            }
            for(int i = 1; i < l.size(); i++){
                if(l.get(i) > l.get(i-1)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
