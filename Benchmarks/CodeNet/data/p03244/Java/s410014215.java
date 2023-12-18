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
        int n = in.nextInt();
        int[] a = new int[n];
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            s.add(a[i]);
        }
        int ans = 0, c1 = 0, c2 = 0;
        boolean ok = s.size() > 1;
        Map<Integer, Integer> m1 = new HashMap<>(),
                              m2 = new HashMap<>();
        for(int i = 0; i < n; i+=2){
            if(!m1.containsKey(a[i])) m1.put(a[i], 0);
            m1.replace(a[i], m1.get(a[i]) + 1);
            c1++;
        }
        for(int i = 1; i < n; i+=2){
            if(!m2.containsKey(a[i])) m2.put(a[i], 0);
            m2.replace(a[i], m2.get(a[i]) + 1);
            c2++;
        }
        int mx1 = 0, mx2 = 0;
        for(int i : m1.keySet()){
            mx1 = Math.max(mx1, m1.get(i));
        }
        for(int i : m2.keySet()){
            mx2 = Math.max(mx2, m2.get(i));
        }
        if(ok){
            System.out.println((c1 - mx1) + (c2 - mx2));
        } else {
            System.out.println(n/2);
        }
    }
}
