import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        ArrayList<Integer>[] al = new ArrayList[26];        
        for(int i = 0; i < 26; i++)
            al[i] = new ArrayList<>();
        int N, Q;
        {int[] a = r.ii(); N = a[0]; Q = a[1];}
        int[] golem = new int[N+2];
        Arrays.fill(golem, 1);
        golem[0] = golem[N+1] = 0;
        String s = r.s();
        for(int i = 0; i < N; i++)
            al[s.charAt(i)-'A'].add(i+1);
        for(int i = 0; i < Q; i++){
            String[] a = r.ss();
            char t = a[0].charAt(0);
            int d = a[1].equals("R") ? 1 : -1;
            ArrayList<Integer> square = al[t-'A'];
            int size = square.size();
            if(d > 0){
                for(int j = size-1; j > -1; j--){
                    int index = square.get(j);
                    int g = golem[index];
                    golem[index+1] += g;
                    golem[index] = 0;                
                }
            } else{
                for(int j = 0; j < size; j++){
                    int index = square.get(j);
                    int g = golem[index];
                    golem[index-1] += g;
                    golem[index] = 0;                
                }
            }
        }
        println(N-golem[0]-golem[N+1]);
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
