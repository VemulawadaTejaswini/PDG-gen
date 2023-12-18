import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int X, Y, Z, K;
        {int[] a = r.ii(); X = a[0]; Y = a[1]; Z = a[2]; K = a[3];}
        long[] A = r.ll();
        long[] B = r.ll();
        long[] C = r.ll();
        long[] D = new long[X*Y];
        long[] E = new long[K*Z];
        for(int i = 0; i < X; i++)
            for(int j = 0; j < Y; j++)
                D[i*Y+j] = A[i]+B[j];
        Arrays.sort(D);

        for(int i = 0; i < Math.min(K, D.length); i++)
            for(int j = 0; j < Z; j++)
                E[i*Z+j] = D[D.length-1-i]+C[j];
        Arrays.sort(E);
        StringBuilder sb = new StringBuilder();
        for(int i = E.length-1; i > E.length-1-K; i--)
            sb.append(E[i]+"\n");
        print(String.valueOf(sb));
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