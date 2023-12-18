import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N = r.i();
        int[] A = r.ii();
        Arrays.sort(A);
        long[] side = new long[2];
        for(int i = N-1, j = 0; i >= 0 && j < 2;){
            int a = A[i];
            int count = 0;
            while(i >= 0 && A[i] == a){
                count++;
                i--;
            }
            if(count > 1){
                side[j] = a;
                j++;
            }
        }
        println(side[0]*side[1]);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
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
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}