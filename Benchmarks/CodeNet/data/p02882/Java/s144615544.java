import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int a, b, x;
        {int[] c = in.ii(); a = c[0]; b = c[1]; x = c[2];}
        if(a*a*b==x){
            System.out.println(0);
            return;
        }
        double y = 2.0*x/a-b;
        double t = y >= 0 ? Math.atan((double)a*a*a/(a*a*b-x)/2):
                            Math.atan(2.0*x/a/b/b);
        out.println(90-t*180/Math.PI);
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
