import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); //
	}
	public void run() {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		ArrayList<T_node> ar = new ArrayList<T_node>();
		for (int i = 0; i < m; i++) {
			ar.add(new T_node(i, i));
		}
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(sc.next());
			ar.add(new T_node(i+m, i+m));
			for (int j = 0; j < k; j++) {
				int lang = Integer.parseInt(sc.next())-1;
				ar.get(m+i).ar.add(lang);
				union(ar, i+m, lang);
			}
		}
		int ans = 1;
		int tmp = getp(ar, m);
		for (int i = 1; i < n; i++) {
			if(tmp != getp(ar, m+i))
			{
				ans = 0;
			}
		}
		if(ans == 1)
		{
			out.println("YES");
		}
		else {
			out.println("NO");
		}
		
		out.flush();
	}
	void union(ArrayList<T_node> ar, int x, int y)
	{
		int xp = getp(ar,x);
		int yp = getp(ar,y);
		if(xp == yp)
		{
			
		}
		else {
			ar.get(xp).p = yp;
		}
	}
	int getp(ArrayList<T_node> ar, int x)
	{
		int p = x;
		if(ar.get(x).p == x)
		{
			return x;
		}
		else {
			p = getp(ar, ar.get(x).p);
			ar.get(x).p = p;
			return p;
		}
	}
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(String in) {
        	StringReader sr = new StringReader(in);
            reader = new BufferedReader(new BufferedReader(sr));
            tokenizer = null;
        }
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
    }
}

class T_node {

	int n;
	int p;
	ArrayList<Integer> ar;

	T_node(int tn, int tp) {
		n = tn;
		p = tp;
		ar = new ArrayList<Integer>();
	}
}