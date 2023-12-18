import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();
    static final int MOD = 1000000007;

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii();
        int[] memo = new int[N];
        for(int i = 0; i < A.length; i++){
            memo[A[i]]++;
        }
        boolean flag = N%2 != 1 || memo[0] == 1;
        if(flag){
            for(int i = N%2+1; i < N; i += 2){
                if(memo[i] != 2){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag ? power(2, N/2) : 0);
    }

    static long power(long a, int b){
        long ret = 1;
        while(b != 0){
            if(b%2 == 1){
                ret = ret * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return ret;
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
