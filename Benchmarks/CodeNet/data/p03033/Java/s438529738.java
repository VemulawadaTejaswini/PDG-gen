import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N, Q;
        {int[] a = r.ii(); N = a[0]; Q = a[1];}
        int[][] work = new int[N][3];
        for(int i = 0; i < N; i++){
            work[i] = r.ii();
        }
        int[] D = r.ii(Q);
        Arrays.sort(work, (x, y) -> x[2]-y[2]);
        loop:for(int i = 0; i < Q; i++){
            for(int j = 0; j < N; j++){
                int[] w = work[j];
                int t = D[i]+w[2];
                if(w[0] <= t && t < w[1]){
                    println(w[2]);
                    continue loop;
                }
            }
            println(-1);
        }
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
            for(int i = 0; i < N; i++)
                ii[i] = i();
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
