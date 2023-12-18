import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int N = r.i();
        String[] s = new String[N];
        for(int i = 0; i < N; i++){
            char[] temp = r.s().toCharArray();
            Arrays.sort(temp);
            s[i] = String.valueOf(temp);
        }
        Arrays.sort(s, (x, y) -> x.compareTo(y));
        long ans = 0;
        for(int i = 0; i < N; ){
            String temp = s[i];
            int j = i;
            while(j < N && temp.equals(s[j])){
                j++;
            }
            long n = j-i;
            ans += n*(n-1)/2;
            i = j;
        }
        println(ans);
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
    static class MyReader extends BufferedReader{
        MyReader(){
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
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}