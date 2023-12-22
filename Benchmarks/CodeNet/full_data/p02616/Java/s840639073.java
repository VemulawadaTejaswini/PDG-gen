import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Input in = new Input(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		EMultiplication4 solver = new EMultiplication4();
		solver.solve(1, in, out);
		out.close();
	}
	static class EMultiplication4 {
		public void solve(int testNumber, Input in, PrintWriter pw) {
			int n = in.nextInt(), k = in.nextInt();
			ArrayList<BigInteger> pos = new ArrayList<>(), neg = new ArrayList<>();
			for(int i = 0; i<n; i++) {
				long x = in.nextInt();
				if(x >= 0) {
					pos.add(BigInteger.valueOf(x));
				}
				if(x<=0) {
					neg.add(BigInteger.valueOf(x));
				}
			}
			Collections.sort(pos);
			Collections.sort(neg);
			ArrayList<BigInteger> bpos = new ArrayList<>(), bneg = new ArrayList<>();
			BigInteger tot = BigInteger.ONE;
			for(int i = pos.size()-1; i >= 0; i--) {
				bpos.add(tot);
				tot = tot.multiply(pos.get(i));
			}
			bpos.add(tot);
			tot = BigInteger.ONE;
			for(int i = 0; i<neg.size(); i++) {
				bneg.add(tot);
				tot = tot.multiply(neg.get(i));
			}
			bneg.add(tot);
			BigInteger ans = null;
			for(int i = 0; i<=k; i++) {
				if(bpos.size()>i&&bneg.size()>k-i) {
					BigInteger cur = bpos.get(i).multiply(bneg.get(k-i));
					if(ans==null||ans.compareTo(cur)<0) {
						ans = cur;
					}
				}
			}
			Collections.sort(pos, Comparator.reverseOrder());
			Collections.sort(neg, Comparator.reverseOrder());
			bpos = new ArrayList<>();
			bneg = new ArrayList<>();
			tot = BigInteger.ONE;
			for(int i = pos.size()-1; i >= 0; i--) {
				bpos.add(tot);
				tot = tot.multiply(pos.get(i));
			}
			bpos.add(tot);
			tot = BigInteger.ONE;
			for(int i = 0; i<neg.size(); i++) {
				bneg.add(tot);
				tot = tot.multiply(neg.get(i));
			}
			bneg.add(tot);
			for(int i = 0; i<=k; i++) {
				if(bpos.size()>i&&bneg.size()>k-i) {
					BigInteger cur = bpos.get(i).multiply(bneg.get(k-i));
					if(ans==null||ans.compareTo(cur)<0) {
						ans = cur;
					}
				}
			}
			pw.println(ans.mod(BigInteger.valueOf(1000000007)));
		}

	}

	static class Input {
		BufferedReader br;
		StringTokenizer st;

		public Input(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
			try {
				st = new StringTokenizer(br.readLine());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		public boolean hasNext() {
			try {
				while(!st.hasMoreTokens()) {
					String s = br.readLine();
					if(s==null) {
						return false;
					}
					st = new StringTokenizer(s);
				}
				return true;
			}catch(Exception e) {
				return false;
			}
		}

		public String next() {
			if(!hasNext()) {
				throw new InputMismatchException();
			}
			return st.nextToken("\r\n\t\f ");
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

