import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {

	static class Task {
		
		int NN = 200005;
		int MOD = 1000000007;
		int INF = 2000000000;
		long INFINITY = 2000000000000000000L;

		String s;
		int n;
		
		long [][][][] dp;
		
		long rec(int i, int f1, int f2, int f3) {
			if(i==n) {
				return 1;
			}
			if(dp[i][f1][f2][f3] != -1)
				return dp[i][f1][f2][f3];
			List<Integer> l1 = new ArrayList<>();
			l1.add(0);
			if(f1 == 1 || s.charAt(i)-'0'==1)
				l1.add(1);
			List<Integer> l2 = new ArrayList<>();
			l2.add(0);
			if(f2 == 1 || s.charAt(i)-'0'==1)
				l2.add(1);
			long ret = 0;
			for(int d1:l1) {
				for(int d2:l2) {
					if((d1&d2)==0) {
						if(f3==0 && (d1^d2)>s.charAt(i)-'0')
							continue;						
						int _f1 = f1;
						if(f1 == 0)
							_f1 = d1<s.charAt(i)-'0'?1:0;
						int _f2 = f2;
						if(f2 ==0)
							_f2 = d2<s.charAt(i)-'0'?1:0;
						int _f3 = f3;
						if(f3 == 0) {
							_f3 = (d1^d2)<s.charAt(i)-'0'?1:0;
						}
						ret = (ret + rec(i + 1, _f1, _f2, _f3))%MOD;
					}
				}
			}
			return dp[i][f1][f2][f3] = ret;
		}
		
		public void solve(InputReader in, PrintWriter out) {
			s = in.next();
			n = s.length();
			dp = new long[n][2][2][2];
			for(int i=0;i<n;++i) {
				for(int ii=0;ii<2;++ii) {
					for(int iii=0;iii<2;++iii) {
						dp[i][ii][iii][0]=dp[i][ii][iii][1]=-1;
					}
				}
			}
			out.println(rec(0, 0, 0, 0));
		}
		
	}
	
	static void prepareIO(boolean isFileIO) {
		//long t1 = System.currentTimeMillis();
		Task solver = new Task();
		// Standard IO
		if(!isFileIO) { 
			InputStream inputStream = System.in;
	        OutputStream outputStream = System.out;
	        InputReader in = new InputReader(inputStream);
	        PrintWriter out = new PrintWriter(outputStream);
	        solver.solve(in, out);
	        //out.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);
	        out.close();
		}
        // File IO
		else {
			String IPfilePath = System.getProperty("user.home") + "/Downloads/ip.in";
	        String OPfilePath = System.getProperty("user.home") + "/Downloads/op.out";
	        InputReader fin = new InputReader(IPfilePath);
	        PrintWriter fout = null;
	        try {
				fout = new PrintWriter(new File(OPfilePath));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        solver.solve(fin, fout);
	        //fout.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);
	        fout.close();
		}
	}
	
	public static void main(String[] args) {
        prepareIO(false);
	}
	
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        
        public InputReader(String filePath) {
        	File file = new File(filePath);
            try {
				reader = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            tokenizer = null;
        }
        
        public String nextLine() {
        	String str = "";
        	try {
				str = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return str;
        }
        
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
        	return Double.parseDouble(next());
        }
        
    }

}