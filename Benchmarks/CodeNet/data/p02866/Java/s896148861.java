import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);
    
    static final long C = 998244353;

    public static void main(String[] args){
        int N = in.i();
        int[] D = in.ii();
        int[] count = new int[N+1];
        int max = 0;
        for(int i = 0; i < N; i++){
            count[D[i]]++;
            if(D[i] > max){
                max = D[i];
            }
        }
        count[max+1] = 1;

        long ans = 1;
        for(int i = 0; i <= max; i++){ 
            ans = (ans * pow(count[i], count[i+1]) % C);
        }            
        out.println(ans);
        out.flush();
    }

    public static long pow (long a, long b) {
        return b == 0 ? 1 : b%2 == 0 ? pow (a*a, b/2)%C : (a%C)*pow(a*a, b/2)%C;
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
