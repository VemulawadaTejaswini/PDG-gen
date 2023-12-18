import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[] args){
        int N, M;
        PriorityQueue<Integer> A = new PriorityQueue<>((x,y) -> -x+y);
        long total = 0;
        {
            int[] a = in.ii(); N = a[0]; M = a[1];
            a = in.ii();
            for(int i = 0; i < N; i++){
                A.add(a[i]);
                total += a[i];
            }
        }
        for(int i = 0; i < M; i++){
            int x = A.poll();
            total -= x-x/2;
            A.add(x/2);
        }
        out.println(total);
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
