import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        int MOD = 1000000007;
        int N = r.i();
        
        long[][] num = new long[N+1][10];
        num[0][0] = 1;
        
        int[][] p = {{2,0,2,2,0,2,0,1,1,1},
                     {1,1,0,1,0,1,1,1,0,0},
                     {1,0,1,0,0,0,0,1,1,1},
                     {0,1,0,0,0,0,0,0,0,0},
                     {0,1,0,0,0,0,1,0,0,0},
                     {0,1,0,0,0,0,1,0,0,0},
                     {0,0,1,0,1,0,0,0,1,1},
                     {0,0,0,0,1,0,0,0,0,0},
                     {0,0,0,0,1,0,0,0,0,0},
                     {0,0,0,0,0,1,0,0,0,0}};

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < 10; j++){
                long temp = 0;
                long[] prev = num[i-1];
                int[] pj = p[j];
                for(int k = 0; k < 10; k++)
                    temp = (temp+ prev[k]*pj[k])%MOD;
                num[i][j] = temp;
            }
        }

        long ans = 0;
        for(long i : num[N])
            ans = (ans+i)%MOD;
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
