/* package codechef; // don't place package name! */
// old but im not that old
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
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
    static class Student{
        String name;
        int age;
        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        FastReader in = new FastReader();
        int n = in.nextInt(), m = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n], b = new long[m];
        for(int i = 0; i < n; i++){
            a[i] = in.nextLong();
        }
        for(int i = 0; i < m; i++){
            b[i] = in.nextLong();
        }
        long c = 0;
        long ans = 0;
        boolean ok = true;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                if((c+a[i])<=k){
                    c+=a[i];
                    ans++;
                } else {
                    ok = false;
                    break;
                }
                i++;
            } else {
                if((c+b[j])<=k){
                    c+=b[j];
                    ans++;
                } else {
                    ok = false;
                    break;
                }
                j++;
            }
        }
        if(ok){
            while(i < n && (c+a[i])<=k){
                c+=a[i];
                ans++;
                i++;
            }
            while(j < m && (c+b[j])<=k){
                c+=b[j];
                ans++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
