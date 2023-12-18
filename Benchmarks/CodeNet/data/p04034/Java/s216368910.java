import java.util.*;
import java.io.*;

public class Main {

    void solve() {
	int N = sc.nextInt();
	int M = sc.nextInt();

	int x[] = new int[M];
	int y[] = new int[M];

	for (int i = 0; i < M; i++) {
	    x[i] = sc.nextInt();
	    y[i] = sc.nextInt();
	}

	boolean ans[] = new boolean[N+1];
	int num[] = new int[N+1];

	for (int i = 0; i <= N; i++) {
	    ans[i] = false;
	}

	for (int i = 0; i <= N; i++) {
	    num[i] = 1;
	}

	ans[1] = true;

	for (int i = 0; i < M; i++) {
	    num[x[i]]--;
	    num[y[i]]++;
	    if (ans[x[i]] == true && num[x[i]] == 0) {
		ans[x[i]] = false;
		ans[y[i]] = true;
	    } else if (ans[x[i]] == true && num[x[i]] != 0){
		ans[y[i]] = true;
	    } else {
		continue;
	    }
	}

	int a = 0;
	for (int i = 1; i <= N; i++) {
	    if (ans[i] == true) {
		a++;
	    }
	}

	System.out.println(a);
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
