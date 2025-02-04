import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
public class Main {
    static long dp[]= new long[2006];
    static long mod=(long) (1e9+7);
    static long mod(long x){
        return ((x%mod+mod)%mod);
    }
    static long add(long a,long b){
        return mod(mod(a)+mod(b));
    }



     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
         FastScanner sc = new FastScanner();
         PrintWriter out = new PrintWriter(System.out);

             int n = sc.nextInt();
            long a[][]= new long[4][n];
            for (int i=0;i<n;i++){
                long x=sc.nextLong();
                long y=sc.nextLong();
                a[0][i]=x+y;
                a[1][i]=x-y;
                a[2][i]=-x+y;
                a[3][i]=-x-y;
            }
            for (int i=0;i<4;i++){
                Arrays.sort(a[i]);
            }
            long max=Long.MIN_VALUE;
            for (int i=0;i<4;i++){
                max=Long.max(max,a[i][n-1]-a[i][0]);
            }
         System.out.println(max);
         }









    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static void sortReverse(long[] a) {
        ArrayList<Long> l=new ArrayList<>();
        for (long i:a) l.add(i);
//        Collections.sort.(l);
        Collections.sort(l,Collections.reverseOrder());
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long[] readArrayLong(long n) {
            long[] a=new long[(int)n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }


}