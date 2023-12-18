import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        int N = r.i();
        int[] A = r.ii();
        int[] memo = new int[N];
        for(int a : A)
            memo[a]++;
        boolean flag = true;
        if(N%2 == 1 && memo[0] != 1)
            flag = false;
        else
            for(int i = N%2+1; i < N; i += 2){
                if(memo[i] != 2){
                    flag = false;
                    break;
                }
            }
        println(flag ? power2(N/2) : 0);
    }
    static long power2(int n){
        if(n > 29)
            return (power2(n-30)*((1<<30)%1000000007))%1000000007;
        else
            return 1<<n;        
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