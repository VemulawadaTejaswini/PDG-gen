import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();        
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        int k = (N-1)*(N-2)/2;
        if(k < K){
            println(-1);
            return;
        } else{
            StringBuilder sb = new StringBuilder();
            int extra = k-K;
            sb.append(N-1+extra);
            sb.append("\n");
            int n = 1;
            final String end = " "+N+"\n";
            for(int i = 1; i < N; i++){
                sb.append(i);
                sb.append(end);
            }
            for(int i = 1; i < N-1 && extra > 0; i++){
                for(int j = i+1; j < N && extra > 0; j++, extra--){
                    sb.append(i);
                    sb.append(" ");
                    sb.append(j);
                    sb.append("\n");
                }
            }
            print(sb);
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