import java.util.*;
import java.io.*;



public class Main {

    int[] a;

    void solve() {
	String s = sc.next();
	int K = sc.nextInt();

	// 97 - 122
//	System.out.println((int)s.charAt(0));

//	122 - x
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < s.length(); i++) {
	    int tmp = 123 - (int)sb.charAt(i);
	    if (K >= tmp) {
		K = K - tmp;
		sb.replace(i,i+1, "a");
	    } else {
		continue;
	    }
	}
//	System.out.println(K + " " + sb);
	if (K > 0) {
	    for (int i = s.length()-1; i >= 0 ; i--) {
//		System.out.println(sb);
		int tmp = 122 - (int)sb.charAt(i);
		if ((K - tmp) < 0) {
		    tmp = K;
		}

		K = K - tmp;
		int c = (int)sb.charAt(i) + tmp;
		String a = "" + (char)c;
		sb.replace(i,i+1,a);
		if (K <= 0) {
		    break;
		}
	    }
	}
	System.out.println(sb);
    }

    void print(int[] a) {
	out.print(a[0]);
	for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
	out.println();
    }

    public static void main(String[] args) throws Exception {
	new Main().run();
    }

    MyScanner sc = null;
    PrintWriter out = null;
    public void run() throws Exception {
	sc = new MyScanner(System.in);
	out = new PrintWriter(System.out);
	for (;sc.hasNext();) {
	    solve();
	    out.flush();
	}
	out.close();
    }

    class MyScanner {
	String line;
	BufferedReader reader;
	StringTokenizer tokenizer;

	public MyScanner(InputStream stream) {
	    reader = new BufferedReader(new InputStreamReader(stream));
	    tokenizer = null;
	}
	public void eat() {
	    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
		try {
		    line = reader.readLine();
		    if (line == null) {
			tokenizer = null;
			return;
		    }
		    tokenizer = new StringTokenizer(line);
		} catch (IOException e) {
		    throw new RuntimeException(e);
		}
	    }
	}
	public String next() {
	    eat();
	    return tokenizer.nextToken();
	}
	public String nextLine() {
	    try {
		return reader.readLine();
	    } catch (IOException e) {
		throw new RuntimeException(e);
	    }
	}
	public boolean hasNext() {
	    eat();
	    return (tokenizer != null && tokenizer.hasMoreElements());
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
	public int[] nextIntArray(int n) {
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) a[i] = nextInt();
	    return a;
	}
    }
}
