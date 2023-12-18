import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();
        int N = r.i();
        int[] P = r.ii();

        int[] Q = new int[N+1];
        {
          int i = 0;
          for(int p : P)
            Q[p] = i++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, -1, -1, N, N);
        long ans = 0;
        for(int v = N; v > 0; v--){
          int i = Q[v];
          int j = binarySearch(list, i);
          long w = list.get(j-2);
          long x = list.get(j-1);
          long y = list.get(j);
          long z = list.get(j+1);
          long c = (x-w)*(y-i) + (i-x)*(z-y);
          list.add(j, i);
          ans += v*c;
        }
        println(ans);
    }

    public static int binarySearch(ArrayList<Integer> list, int key){
      int left = 0;
      int right = list.size()-1;
      while(true){
        int middle = left + (right - left)/2;
        int value = list.get(middle);
        if(value == key){
          return middle;
        } else if(value < key){
          left = middle + 1;
        } else {
          right = middle - 1;
        }
        if(right < left){
          return  left < middle ? middle : left;
        }
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
