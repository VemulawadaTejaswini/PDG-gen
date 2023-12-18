import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int N, M;
        long C = 1000000007;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int[] a = new int[M+1];
        for(int i = 0; i < M; i++){
            a[i] = r.i();
        }
        a[M] = N+1;
        long[] f = new long[100000];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i < 100000; i++){
            f[i] = f[i-1] + f[i-2];
        }
        int m = 0;
        long ans = 1;
        for(int i = 0; i < N;){
            int step = 0;
            while(i+1 < a[m]){
                i++;
                step++;
            }
            ans *= f[step];
            ans = ans%C;
            if(m == M){
                break;
            }
            m++;
            if(i+2 == a[m]){
                println(0);
                return;
            } else{
                i += 2;
            }
        }
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
        int[] ii(int N) throws IOException{
            int[] ii = new int[N];
            for(int i : ii) i = i();
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
    }
}