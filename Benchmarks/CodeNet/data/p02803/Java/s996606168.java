import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int H, W;
        {int[] a = in.ii(); H = a[0]; W = a[1];}
        char[][] S = new char[H][W];
        for(int i = 0; i < H; i++){
            S[i] = in.s().toCharArray();
        }
        final int inf = Integer.MAX_VALUE/2;
        int n = H*W;
        int[][] d = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                int h1 = i/W;
                int w1 = i%W;
                int h2 = j/W;
                int w2 = j%W;
                boolean f = S[h1][w1] == '.' && S[h2][w2] == '.' && (h1 == h2 && Math.abs(w1-w2) == 1 || w1 == w2 && Math.abs(h1-h2) == 1);
                if(f){
                    d[i][j] = 1;
                } else {
                    d[i][j] = inf;
                }
            }
        }
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(d[i][j] > d[i][k] + d[k][j]){
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(ans < d[i][j] && d[i][j] < inf){
                    ans = d[i][j];
                }
            }
        }
        out.println(ans);
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
