import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) {
        final FastScanner sc = new FastScanner();
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        List<Integer>[] ar = new ArrayList[n];
        for (int i = 1; i <= n; i++)
            ar[i] = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            final int key = sc.nextInt();
            ar[key-1].add(sc.nextInt());
        }
        
        final int val[] = new int[n + 1];
        Arrays.fill(val, -1);
        int max = 0;
        
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dfs(i, val, ar, 0));
        }
        System.out.println(max);
    }

    public static int dfs(int key,int[] val,List<Integer>[] ar, int sum){
        if(val[key]!=-1)
            return sum+val[key];
        int ans = 0;

        if(ar[key-1] == null || ar[key-1].size()== 0){
            return val[key] = 0;
        }for(int i : ar[key-1]){
            ans= Math.max(ans,dfs(i,val,ar,sum)+1);
        }
        return val[key] = ans+sum;
    }

    static final Random random = new Random();

    static void sort(final int[] a) {
        final int n = a.length;
        for (int i = 0; i < n; i++) {
            final int val = random.nextInt(n);
            final int cur = a[i];
            a[i] = a[val];
            a[val] = cur;
        }
        Arrays.sort(a);
    }

    static void sortl(final long[] a) {
        final int n = a.length;
        for (int i = 0; i < n; i++) {
            final int val = random.nextInt(n);
            final long cur = a[i];
            a[i] = a[val];
            a[val] = cur;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (final IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(final int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}
