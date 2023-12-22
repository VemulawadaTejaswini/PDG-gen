import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static FastScanner sc = new FastScanner();
    public static void main(String[] args) {
       int n=sc.nextInt();
      int d=sc.nextInt();
        int count=0;
      while (n-->=1){
          long x=sc.nextLong();
          long y=sc.nextLong();
//          Math.abs(x);
//          Math.abs(y);
          double dist=Math.sqrt((x*x)+(y*y));
//          System.out.println(dist);

          if (dist<=d){
              count++;
          }
      }
        System.out.println(count);


    }

        static void sortint(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static void sort(long[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (long i : a) l.add((int) i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get(i);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}



