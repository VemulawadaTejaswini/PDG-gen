import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();     
        int N = r.i();
        int[][] xy = new int[N][];
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < N; i++)
            xy[i] = r.ii();
        for(int i = 0; i < N-1; i++){
            int x0 = xy[i][0];
            int y0 = xy[i][1];
            for(int j = i+1; j < N; j++){
                int dx = x0-xy[j][0];
                int dy = y0-xy[j][1];
                if(dx < 0){
                    dx = -dx;
                    dy = -dy;
                }
                String key = dx+" "+dy;
                if(hm.containsKey(key)){
                    hm.put(key, hm.get(key)+1);                    
                } else{
                    hm.put(key, 1);
                }
            }                
        }
        String key = "";
        int max = 0;
        for(String k : hm.keySet()){
            int temp = hm.get(k);
            if(max < temp){
                max = temp;
                key = k;
            }
        }
        int cost = N-max;
        println(cost);
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