import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();   
        int N = r.i();
        int[] a = r.ii();
        int ans = 0;
        for(int i = N; i > 0; i--){
            int s = 0;
            for(int j = 2*i; j <= N; j += i)
                s += a[j-1];
            a[i-1] = (a[i-1]-s%2)%2;
            if(a[i-1] == 1)
                ans++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans).append('\n');
        for(int i = 0; i < N; i++)
            if(a[i] == 1)
                sb.append(i+1).append('\n');
        System.out.print(sb);
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