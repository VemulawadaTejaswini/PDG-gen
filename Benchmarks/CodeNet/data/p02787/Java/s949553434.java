import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int H, N; {int[] a = in.ii(); H = a[0]; N = a[1];}
        int[] A = new int[N];
        int[] B = new int[N];
        int[] dp = new int[H+1];
        Arrays.fill(dp, 100000000);
        dp[0] = 0;
        
        int max = 0;
        for(int i = 0; i < N; i++){
            int[] a = in.ii();
            A[i] = a[0];
            B[i] = a[1];
            if(max < a[0]){
                max = a[0];
            }
        }        

        for(int i = 0; i <= H; i++){
            int min = dp[i];
            for(int j = 0; j < N; j++){
                int k = i-A[j];
                if(0 <= k){
                    int m = dp[k] + B[j];
                    if(m < min){
                        min = m; 
                    }
                }
            }
            dp[i] = min;
        }
        
        int min = dp[H];
        for(int i = H+1, M = H+max; i < M; i++){
            for(int j = 0; j < N; j++){
                int k = i-A[j];
                if(0 <= k && k < H){
                    int m = dp[k] + B[j];
                    if(m < min){
                        min = m;
                    }
                }
            }
        }
        
        out.println(min);
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
