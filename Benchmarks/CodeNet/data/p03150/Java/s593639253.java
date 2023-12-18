// 作者：杨成瑞先生
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

        String s = sc.nextLine();
        String ans = "keyence";

        if(s.substring(0, 7).equals(ans) || s.substring(s.length() - 6).equals(ans)) {
            pw.println("YES");
        }
        else {
            int j = 0;
            for(int i=0;i<ans.length();i++) {
                if(s.charAt(j) == ans.charAt(i)) {
                    j++;
                }
            }
            int k = s.length() - 1;
            for(int i=ans.length()-1;i>=0;i--) {
                if(s.charAt(k) == ans.charAt(i)) {
                    k--;
                }
            }

            /*
            pw.println(ans);
            pw.println(s);
            pw.println(s.substring(0, j));
            pw.println(s.substring(k + 1));
            pw.println(j + (s.length() - k - 1));
            */

            if(j + (s.length() - k - 1) == ans.length()) {
                pw.println("YES");
            }
            else pw.println("NO");
        }

        pw.close();
	}

}

// keyence