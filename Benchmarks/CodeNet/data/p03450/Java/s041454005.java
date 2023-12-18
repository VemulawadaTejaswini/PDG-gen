import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        long[] x = new long[N+1];
        Arrays.fill(x, -1);
        boolean flag = true;
        long max = 0;
        long min = Long.MAX_VALUE;
        for(int i = 0; i < M; i++){
            int[] a = r.ii();
            int L = a[0];
            int R = a[1];
            int D = a[2];
            if(x[L] < 0){
                if(x[R] < 0){
                    x[L] = 0;
                    x[R] = D;
                } else{
                    x[L] = R-D;
                }
            } else {
                if(x[R] < 0){
                    x[R] = x[L]+D;
                } else{
                    if(x[R]-x[L] != D){
                        flag = false;
                        break;
                    }
                }
            }
            if(max < x[R])
                max = x[R];
            if(x[L] < min)
                min = x[L];
        }
        if(max-min > 1000000000)
            flag = false;
        println(flag ? "Yes" : "No");
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int Int(String s){
            return Integer.parseInt(s);
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }

    }
}