import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        int n = s.nextInt();
        
        int[] l = new int[n];
        while (n-- > 0)
        {
            l[n] = s.nextInt();
        }
        int count = 0;
        Arrays.sort(l);
        n=l.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(l[i]==l[j])  continue;
                for(int k=j+1;k<n;k++){
                    if(l[j]==l[k])  continue;
                    if(l[i]+l[j]>l[k])
                        count++;
                }
            }
        }
        System.out.println(count);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (final IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (final IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}