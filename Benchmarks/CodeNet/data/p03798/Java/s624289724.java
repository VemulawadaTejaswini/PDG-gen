import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        String str = in.s();
        for (int i = 0; i < 4; i++) {
            char[] ans = new char[N];
            int s = i;
            for (int j = 0; j < N; j++) {
                int f0 = s / 2;
                int f1 = s % 2;
                int f2 = f0 ^ (str.charAt(j) == 'o' ? 0 : 1);
                ans[(j+1) % N] = f2 == 0 ? 'S' : 'W'; 
                s = ((f1 ^ f2) << 1) | f2;
            }
            if (i == s) {
                out.println(ans);
                return;
            }
        }
        out.println(-1);
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
