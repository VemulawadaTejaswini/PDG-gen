import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, M;
        {int[] a = in.ii(); N = a[0]; M = a[1];}
        int[] a = in.ii();
        long ans = (M*2/lcm(a)+1)/2;
        out.println(ans);
        out.flush();
    }

    static long lcm(int[] ii){
        long lcm = ii[0];
        for(int j = 1; j < ii.length; j++)
            lcm = lcm/gcd(lcm, ii[j])*ii[j];
        return lcm;
    }

    static long gcd(long a, long b){
        long r = b%a;
        return r == 0 ? a : gcd(r, a);
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
