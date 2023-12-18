import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        long n = in.l();
        long s = in.l();
        long ans = -1;
        if(s == n){
            ans = n+1;
        } else if (s < n){
            final int rootN = (int)Math.sqrt(n);
            for(int b = 2; b <= rootN; b++){
                long sum = 0;
                for(long i = n; i > 0; i /= b){
                    sum += i % b;
                }
                if(sum == s){
                    ans = b;
                    break;
                }
            }
            if(ans < 0){
                for(int p = 1; p < rootN; p++){
                    if((n-s)%p == 0){
                        long b = (n-s)/p+1;
                        long sum = 0;
                        for(long i = n; i > 0; i /= b){
                            sum += i % b;
                        }
                        if(sum == s){
                            ans = b;
                            break;
                        }
                    }
                }
            }
        }
        out.println(ans);
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
