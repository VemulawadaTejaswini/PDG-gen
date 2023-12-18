import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int N, Q;
        {int[] a = r.ii(); N = a[0]; Q = a[1];}
        String s = r.s();
        
        String[][] spell = new String[Q][];
        for(int i = 0; i < Q; i++)
            spell[i] = r.ss();
          
        int left = 0;
        int right = N+1;
      
        while(left + 1 < right){
            int golem = (right+left)/2;
            int next = golem;
            boolean flag = false;
            
            for(String[] sp : spell){
                if(s.charAt(golem-1) == sp[0].charAt(0)){
                    golem += sp[1].equals("R") ? 1 : -1;
                    if(golem < 1){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag)
                left = next;
            else
                right = next;
        }
        
        int ans = N-left;
        
        right = N+1;
        left = 0;
        
        while(left + 1 < right){
            int golem = (right+left)/2;
            int next = golem;
            boolean flag = false;
            
            for(String[] sp : spell){
                if(s.charAt(golem-1) == sp[0].charAt(0)){
                    golem += sp[1].equals("R") ? 1 : -1;
                    if(golem > N){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                right = next;
            } else
                left = next;
        }
        ans -= N-right+1;
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
