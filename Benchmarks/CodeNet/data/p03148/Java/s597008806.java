import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args){
        int N, K;
        {int[] a = in.ii(); N = a[0]; K = a[1];}

        ArrayList<int[]> sushi = new ArrayList(N);
        for(int i= 0; i < N; i++)
            sushi.add(in.ii()); 
        sushi.sort((x, y) -> -x[1]+y[1]);

        long point = 0;

        boolean[] kind = new boolean[N];
        PriorityQueue<int[]> heap = new PriorityQueue<>((x, y) -> x[1]-y[1]);
        long x = 0;

        for(int i = 0; i < K; i++){
            int[] s = sushi.get(i);
            if(kind[s[0]-1]){
                heap.add(s);
            } else {
                kind[s[0]-1] = true;
                x++;
            }
            point += s[1];
        }
        point += x*x;

        long max = point;
        for(int i = K; i < N && !heap.isEmpty(); i++){
            int[] w = sushi.get(i);
            if(!kind[w[0]-1]){
                int[] v = heap.poll();
                point += 2*x+1 + w[1] - v[1];
                if(max < point)
                    max = point;
                kind[w[0]-1] = true;
                x++;
            }
        }
        
        out.println(max);
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
