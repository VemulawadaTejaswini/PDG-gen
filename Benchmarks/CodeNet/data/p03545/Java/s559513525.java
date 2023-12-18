import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

    final static boolean fileIO = false;
    final static boolean DEBUG = false;
    final static String input = "input.txt";
    final static String output = "output.txt";
    
    public static void main(String args[]) throws Exception {

		InputStream is = null;
		OutputStream os = null;
		if (fileIO) {
			is = new FileInputStream("input.txt");
			os = new FileOutputStream("output.txt");
		} else {
			is = System.in;
			os = System.out;
		}
		InputReader in = new InputReader(is);
		PrintWriter out = new PrintWriter(os);
		new Task_C().solve(in, out);
		out.close();	

	}

static class Task_A {
	
	public void solve(InputReader in, PrintWriter out) {
		char a[] = in.nextString("\n").toCharArray();
		boolean ans = false;
		if ((a[0] == a[1] && a[1] == a[2]) || (a[1] == a[2] && a[2] == a[3])){
			ans = true;
		}
		out.println(ans ? "Yes" : "No");
	}
}

static class Task_B {
		
	public void solve(InputReader in, PrintWriter out) {
		int n = in.nextInt();
		BigInteger pre1 = BigInteger.ONE;
		BigInteger pre2 = BigInteger.valueOf(2);
		BigInteger cur = BigInteger.valueOf(2);
		for (int i = 2; i <= n; ++i) {
			cur = pre1.add(pre2);
			pre2 = pre1;
			pre1 = cur;
		}
		out.println(cur);
	}
}

static class Task_C {
	char ans[] = new char[9];	
	public void solve(InputReader in, PrintWriter out) {
		char digits[] = in.nextString("\n").toCharArray();
		char dig[] = new char[7];
		dig[0] = digits[0];
		dig[2] = digits[1];
		dig[4] = digits[2];
		dig[6] = digits[3];
		if (DEBUG) {
			System.out.print("dig = ");
			for (int i = 0; i < dig.length; ++i) {
				System.out.print(dig[i]);
			}
			System.out.println();		
		}
		ans[ans.length - 2] = '=';
		ans[ans.length - 1] = '7';
		rec(dig, 1);
		for (int i = 0; i < ans.length; ++i) {
			out.print(ans[i]);
		}
		out.println();
	}

	private void rec(char dig[], int pos) {
		if (pos >= dig.length) {
			int tmp = 0;
			boolean add = true;
			for (int i = 0; i < dig.length; ++i) {
				if (dig[i] == '+') {
					add = true;
				} else if (dig[i] == '-') {
					add = false;
				} else {
					if (add) {
						tmp += (int)(dig[i] - '0');
					} else {
						tmp -= (int)(dig[i] - '0');
					}
				}
			}
			if (DEBUG) {
				System.out.print("tmp = ");
				System.out.println(tmp);			
			}
			if (tmp == 7) {
				for (int i = 0; i < dig.length; ++i) {
					ans[i] = dig[i];
				}
				if (DEBUG) {
					System.out.print("ans = ");
					for (int i = 0; i < ans.length; ++i) {
						System.out.print(ans[i]);
					}
					System.out.println();
				}
			}
		} else {
			dig[pos] = '+';
			rec(dig, pos + 2);
			dig[pos] = '-';
			rec(dig, pos + 2);
		}
	}
}


static class InputReader {
	
	private StringTokenizer tokenizer;
	private BufferedReader reader;

	public InputReader(InputStream is) {
		tokenizer = null;
		reader = new BufferedReader(new InputStreamReader(is), 32768);
	}

	public String nextString(String delim) {
		String ans = null;
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				String line = reader.readLine();
				if (line != null) {
					tokenizer = new StringTokenizer(line, delim);
					ans = tokenizer.nextToken();
				} else {
					ans = null;
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else {
			ans = tokenizer.nextToken();
		}
		return ans;
	}
	
	public Integer nextInt() {
		return Integer.parseInt(nextString(" "));		
	}
}
}


