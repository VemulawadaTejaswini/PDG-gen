import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        long n = in.l();
        long s = in.l();
        if(s == n){
            out.println(n+1);
        } else {
            final double rootN = Math.sqrt(n-1)+1;
            boolean flag = true;
            for(int b = 2; b < rootN; b++){
                long sum = 0;
                for(long i = n; i > 0; i /= b){
                    sum += i % b;
                }
                if(sum == s){
                    out.println(b);
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int p = 1; p < rootN; p++){
                    if((n-s)%p == 0){
                        long b = (n-s)/p+1;
                        long sum = 0;
                        for(long i = n; i > 0; i /= b){
                            sum += i % b;
                        }
                        if(sum == s){
                            out.println(b);
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag){
                    out.println(-1);
                }
            }
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
