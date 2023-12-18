//Atcoder
import java.io.*;
import java.util.*;

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

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] grid = new char[h][w];
        for(int i=0;i<h;i++) grid[i] = sc.nextLine().toCharArray();

        int ans = 0;

        for(int i=0;i<h;i++) {
            for(int j=0;j<w;j++) {
                if(grid[i][j] == '.') {
                    int cnt = 1;
                    int k = j-1;
                    while(k >= 0 && grid[i][k] == '.') {
                        cnt++;
                        k--;
                    }
                    k = j+1;
                    while(k < w && grid[i][k] == '.') {
                        cnt++;
                        k++;
                    }
                    k = i-1;
                    while(k >= 0 && grid[k][j] == '.') {
                        cnt++;
                        k--;
                    }
                    k = i+1;
                    while(k < h && grid[k][j] == '.') {
                        cnt++;
                        k++;
                    }
                    ans = Math.max(ans, cnt);
                }
            }
        }

        pw.println(ans);
        pw.close();
    }
}
