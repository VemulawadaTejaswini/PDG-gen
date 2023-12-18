import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N;
        long K;
        {long[] a = in.ll(); N = (int)a[0]; K = a[1];}
        int[] A = in.ii();
        int[] F = in.ii();
        Arrays.sort(A);
        Arrays.sort(F);
        
        long l = 0;
        long r = 1000000000000L;
        while(l < r){
            long m = (l+r)/2;
            long c = 0;
            for(int i = 0; i < N; i++){
                c += Math.max(A[N-1-i] - m/F[i], 0);
            }
            if(c <= K){
                r = m;
            } else {
                l = m+1;
            }
        }
        out.println(r);
        out.flush();
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
