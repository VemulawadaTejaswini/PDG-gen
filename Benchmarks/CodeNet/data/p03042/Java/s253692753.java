import java.io.*;
import java.util.*;
import java.util.Map.Entry;

		
public class Main {
	public static void main(String[] args) throws Exception{
		MScanner sc = new MScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String x=sc.nextLine();
        int f=Integer.parseInt(x.substring(0,2));int s=Integer.parseInt(x.substring(2));
        if(f<=12 && f>0 && s<=12 && s>0) {
        	pw.println("AMBIGUOUS");
        }
        else {
        	if((f>12 || f<=0) && (s>12 || s<=0)) {
        		pw.println("NA");
        	}
        	else {
        		if(f<=12 && f>0) {
        			pw.println("MMYY");
        		}
        		else {
        			pw.println("YYMM");
        		}
        	}
        }
        pw.flush();
    }
	
	static class MScanner {
        StringTokenizer st;
        BufferedReader br;

        public MScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}		