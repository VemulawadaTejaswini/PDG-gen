import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();    
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int d = Math.abs(N-M);
        long[] fact = new long[100001];
        fact[0] = 1;
        for(int i = 1; i < fact.length; i++)
            fact[i] = (fact[i-1]*i)%1000000007;
        int temp = (int)((fact[N]*fact[M])%1000000007);
        println(d == 0 ? 2*temp : d == 1 ? temp : 0);
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
    static class MyReader extends BufferedReader{
        MyReader(){
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

        int[] ii(int N) throws IOException{
            int[] ii = new int[N];
            for(int i = 0; i < N; i++) ii[i] = i();
            return ii;
        }

    }
}