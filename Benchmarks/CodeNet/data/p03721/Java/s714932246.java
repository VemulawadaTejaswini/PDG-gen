import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();    
        int N, K;
        {int[] a = r.ii(); N = a[0]; K = a[1];}
        long[] num = new long[100001];
        for(int i = 0; i < N; i++){
            int[] c = r.ii();
            num[c[0]] += c[1];
        }
        long k = 0;
        int i = 1;
        for(; i < 100001; i++){
            k += num[i];
            if(k >= K)
                break;   
        }
        println(i);
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
        void read(Integer a) throws IOException{
            a = i();
        }
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

        void ii(int[] ii) throws IOException{
            for(int i = 0; i < ii.length; i++) ii[i] = i();
        }
    }
}