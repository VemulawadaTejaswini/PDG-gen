import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();
        int N, W;
        {int[]a = r.ii(); N = a[0]; W = a[1];}
        int[] w = new int[N];
        int[] v = new int[N];
        for(int i = 0; i < N; i++){
            int[] a = r.ii();
            w[i] = a[0];
            v[i] = a[1];
        }
        long[][] max = new long[N+1][W+1];
        for(int i = 1; i < N+1; i++){
            for(int j = 0; j < Math.min(w[i-1], W+1); j++)
                max[i][j] = max[i-1][j];
            for(int j = w[i-1]; j < W+1; j++)
                max[i][j] = Math.max(max[i-1][j], max[i-1][j-w[i-1]]+v[i-1]);
        }
        println(max[N][W]);
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
    }
}