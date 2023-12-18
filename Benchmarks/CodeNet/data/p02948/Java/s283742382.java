import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();        
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int[][] work = new int[N][2];
        for(int i = 0; i < N; i++)
            work[i] = r.ii();
            
        Arrays.sort(work, (x, y) -> -x[0]+y[0]);
        long ans = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> -x+y);
        for(int i = Math.min(M-1, N-1), j = N-1; i >= 0; i--){            
            while(j >= 0 && i+work[j][0] <= M){
                heap.add(work[j][1]);
                j--;
            }
            if(heap.size() > 0)
                ans += heap.poll();            
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
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}