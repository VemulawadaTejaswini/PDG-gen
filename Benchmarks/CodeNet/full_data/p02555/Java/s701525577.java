import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
public class Main {
    static long dp[]= new long[2000];
    static long find(int s){
        if (s==0){
            return 1;
        }
        if (s==1||s==2){
            return 0;
        }
        long mod=(long) (1e9+7);
        if (dp[s]!=-1)return dp[s];
        long total=0;
        for (int i=3;i<=s;i++){
            if (s-i>=0){
//                total=add(total,find(s-i));
                total=(total+find(s-i))%mod;
            }
        }
        return dp[s]=total;
    }

     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
         FastScanner sc = new FastScanner();
         PrintWriter out = new PrintWriter(System.out);
         int n=sc.nextInt();
         Arrays.fill(dp,-1);
         System.out.println(find(n));

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