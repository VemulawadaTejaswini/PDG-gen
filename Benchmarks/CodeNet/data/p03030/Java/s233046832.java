import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N = r.i();
        String[] S = new String[N];
        int[] P = new int[N];
        SortedMap<String, ArrayList<Integer>> map = new TreeMap<>();
        for(int i = 0; i < N; i++){
            String[] temp = r.ss();
            if(!map.containsKey(temp[0]))
                map.put(temp[0], new ArrayList<>());
            map.get(temp[0]).add(i);
            P[i] = Int(temp[1]);
        }
        for(String key : map.keySet()){
            ArrayList<Integer> array = map.get(key);
            ArrayList<int[]> array1 = new ArrayList<>();
            for(int idx : array){
                array1.add(new int[]{idx, P[idx]});
            }
            array1.sort((x, y)->-x[1]+y[1]);
            for(int[] temp : array1)
                println(temp[0]+1);
        }
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
