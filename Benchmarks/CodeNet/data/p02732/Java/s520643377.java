import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii();
        int[] count = new int[N+1];
        HashSet<Integer> idx = new HashSet<>(N);
        for (int i = 0; i < N; i++) {
            count[A[i]]++;
            idx.add(A[i]);
        }
        long sum = 0;
        for (int i : idx) {
            sum += (long)count[i] * (count[i] - 1) / 2;
        }
        for (int i = 0; i < N; i++) {
            out.println(sum - count[A[i]] + 1);
        }
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
    }
}
