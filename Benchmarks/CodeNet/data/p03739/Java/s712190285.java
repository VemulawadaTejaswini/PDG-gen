import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int n = in.i();
        int[] a = in.ii();
        out.println(Math.min(solve(a, 1), solve(a, -1)));
    }

    static long solve(int[] a, int b) {
        long s = 0;
        long r = 0;
        for (int i = 0; i < a.length; i++) {
            long x = s + a[i];
            if (b * x > 0) {
                s = x;
            } else {
                s = b;
                r += Math.abs(x) + 1;
            }
            b = -b;
        }
        return r;
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
