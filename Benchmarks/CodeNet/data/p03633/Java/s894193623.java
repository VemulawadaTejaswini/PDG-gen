import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int N = r.i();
        long[] T = r.ll(N);
        long ans = T[0];
        for(int i = 1; i < N; i++)
            ans = lcm(ans, T[i]);
        println(ans);
    }

    static void print(Object o){
        System.out.print(o.toString());
    }

    static void println(Object o){
        System.out.println(o.toString());
    }

    static int Int(String s){
        return Integer.parseInt(s);
    }

    static long Long(String s){
        return Long.parseLong(s);
    }

    static long lcm(long a, long b){
        return a/gcd(a, b)*b;
    }
    static long gcd(long a, long b){
        if(b < a){
            long c = a;
            a = b;
            b = c;
        }
        long r;
        while((r=b%a)>0){
            b = a;
            a = r;
        }          
        return a;
    }

    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }   

        long[] ll(int N) throws IOException{
            long[] ll = new long[N];
            for(int i = 0; i < N; i++) ll[i] = l();            
            return ll;
        }
    }
}