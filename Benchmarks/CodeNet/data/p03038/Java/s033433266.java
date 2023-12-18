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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {

	static class Task {
		
		int NN = 200005;
		int MOD = 1000000007;
		int INF = 2000000000;
		long INFINITY = 2000000000000000000L;
		
		class Query{
			Integer b, c;

			public Query(Integer b, Integer c) {
				super();
				this.b = b;
				this.c = c;
			}
			
		}
		
		Query [] q;
		int [] a;
		Map<Integer, Integer> f = new TreeMap<>();
		
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt(), m =in.nextInt();
			a = new int[n];
			for(int i=0;i<n;++i) {
				a[i] = in.nextInt();
				int cnt = 0;
				if(f.containsKey(a[i]))
					cnt = f.get(a[i]);
				++cnt;
				f.put(a[i], cnt);
			}
			q = new Query[m];
			for(int i=0;i<m;++i) {
				q[i] = new Query(in.nextInt(), in.nextInt());
				if(!f.containsKey(q[i].c))
					f.put(q[i].c, 0);
			}
			int ind = -1;
			Map<Integer, Integer> index = new HashMap<>();
			List<Pair> L = new ArrayList<>();
			for(int k: f.keySet()) {
				L.add(new Pair(k, f.get(k)));
				index.put(k, ++ind);
			}
			int ptr = 0;
			for(int i=0;i<m;++i) {
				int cnt = 0;
				while(cnt < q[i].b && L.get(ptr).val < q[i].c) {
					int need = q[i].b - cnt;
					int available = L.get(ptr).freq;
					if(available > need) {
						L.get(ptr).freq -= need;
						cnt += need;
						break;
					}
					L.get(ptr++).freq = 0;
					cnt += available;
				}
				int position = index.get(q[i].c);
				L.get(position).freq += cnt;
			}
			long ans = 0;
			for(int i=0;i<L.size();++i) {
				ans += 1L * L.get(i).val * 1L * L.get(i).freq;
			}
			out.println(ans);
		}
		
		class Pair {
			Integer val, freq;

			public Pair(Integer val, Integer freq) {
				super();
				this.val = val;
				this.freq = freq;
			}
			
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