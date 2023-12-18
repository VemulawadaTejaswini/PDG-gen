import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, K;
        {int[] a = in.ii(); N = a[0]; K = a[1];}
        int[] D = in.ii();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(i);
        for(int i = 0; i < K; i++)
            list.remove(Collections.binarySearch(list, D[i]));

        int d = 0;
        for(int n = N; n > 0; d++)
            n /= 10;

        loop: for(int i = N; i < 10*N; i++){
            int x = i;
            for(int j = 0; j < d; j++){
                int id = Collections.binarySearch(list, x%10);
                if(id < 0)
                    continue loop;
                x /= 10;
            }
            out.print(i);
            break;
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
