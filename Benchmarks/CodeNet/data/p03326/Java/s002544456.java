import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        long[] x = new long[N],
               y = new long[N],
               z = new long[N];
               
        for(int i = 0; i < N; i++){
            long[] a = r.ll();
            x[i] = a[0];
            y[i] = a[1];
            z[i] = a[2];
        }
        
        long max = 0;
        for(int i = 0; i < 8; i++){
            String sign = String.format("%03d", Integer.parseInt(Integer.toBinaryString(i)));             
            int xs = sign.charAt(0) == '0' ? 1 : -1,
                ys = sign.charAt(1) == '0' ? 1 : -1,
                zs = sign.charAt(2) == '0' ? 1 : -1; 
                
            long[] w = new long[N];
            for(int j = 0; j < N; j++)
                w[j] += x[j]*xs + y[j]*ys + z[j]*zs;
            
            Arrays.sort(w);
            long sum = 0;
            for(int j = 0; j < M; j++)
                sum += w[N-1-j];
            
            if(max < sum)
                max = sum;
        }
        print(max);        
    }

    static void print(Object o){
        System.out.println(o.toString());
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

        int Int(String s){
            return Integer.parseInt(s);
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

        long Long(String s){
            return Long.parseLong(s);
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