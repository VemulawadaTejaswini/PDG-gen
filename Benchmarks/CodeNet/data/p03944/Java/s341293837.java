import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int W, H, N; {int[] a = in.ii(); W = a[0]; H = a[1]; N = a[2];}
        boolean[][] color = new boolean[W][H];
        int ans = W*H;
        for(int i = 0; i < N; i++){
            int x, y, a; {int[] b = in.ii(); x = b[0]; y = b[1]; a = b[2];}
            int jn = a == 1 ? x : W;
            int kn = a == 3 ? y : H;
            for(int j = a == 2 ? x : 0; j < jn; j++){
                for(int k = a == 4 ? y : 0; k < kn; k++){
                    if(!color[j][k]){
                        ans--;
                        color[j][k] = true;
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
