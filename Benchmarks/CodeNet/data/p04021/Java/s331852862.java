import java.util.*;
import java.io.*;

public class Main {

    int[] a;
    int[] b;

    void solve() {
	int N = sc.nextInt();
	a = sc.nextIntArray(N);

	b = Arrays.copyOf(a, N);
	Arrays.sort(b);

	int[] c = new int[1000000001];

	for (int i = 0; i < b.length; i++) {
	    c[b[i]] = i;
	}

	int ans = 0;
	for (int i = 0; i < a.length; i++) {
//	    System.out.println(c[a[i]]);
	    if (i % 2 == 0) {
		if (c[a[i]] % 2 != 0) {
		    ans++;
		}
	    }
	}
	System.out.println(ans);
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
