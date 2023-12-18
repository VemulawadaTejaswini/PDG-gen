import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }
 
        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }
 
        public int nextInt() {return Integer.parseInt(next());}
 
        public long nextLong() {return Long.parseLong(next());}
 
        public double nextDouble() {return Double.parseDouble(next());}
 
        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }
 
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int cnt = 0;
        for(int i=0;i<n;i++) {
            int t = sc.nextInt();
            if(t < a || t >= b) cnt++;
        }

        pw.println(cnt);
        pw.close();
    }
}   

