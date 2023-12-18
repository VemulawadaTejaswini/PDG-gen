import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();
        int N = r.i();
        int[][] V = new int[N][2];
        for(int i = 0; i < N; i++){
            V[i] = r.ii();
        }
        long R2 = 0;
        for(int i = 0; i < 100; i++){
            double theta = 2*Math.PI*i/100;
            double a = Math.cos(theta);
            double b = Math.sin(theta);
            long X = 0;
            long Y = 0;
            for(int[] v : V){
                long x = v[0];
                long y = v[1];
                if(a*x+b*y > 0){
                    X += x;
                    Y += y;
                }
            }
            long r2 = X*X+Y*Y;
            if(r2 > R2){
                R2 = r2;
            }
        }
        println(Math.sqrt(R2));
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