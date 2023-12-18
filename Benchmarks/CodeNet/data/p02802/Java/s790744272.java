import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, M;
        {int[] a = in.ii(); N = a[0]; M = a[1];}
        int t = 0;
        int f = 0;
        int[] x = new int[N+1];
        boolean[] y = new boolean[N+1];
        for(int i = 0; i < M; i++){
            String[] a = in.ss();
            int p = Integer.parseInt(a[0]);
            String s = a[1];
            if(!y[p]){
                if(s.equals("AC")){
                    y[p] = true;
                    t++;
                    f += x[p];
                } else {
                    x[p]++;
                }
            }
        }
        out.println(t+" "+f);
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
