import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();    
        int N, A, B;
        {int[] a = r.ii(); N = a[0]; A = a[1]; B = a[2];}
        int[] h = r.ii(N);
        long M = max(h)/B+1;
        long left = 0;
        long right = M;
        long middle;
        while(right-left > 1){
            middle = (left+right)/2;
            long count = 0;
            for(int x : h)
                count += Math.max((x-B*middle-1)/(A-B)+1,0);
            if(count <= middle)
                right = middle;
            else
                left = middle;
        }
        println(right);
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
    static int max(int... ii){
        int max = ii[0];
        for(int i : ii) if(max < i) max = i;
        return max;
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
        int[] ii(int N) throws IOException{
            int[] ii = new int[N];
            for(int i = 0; i < N; i++) ii[i] = i();
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