import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer> lAdy[];
	static int nodos, aristas;
	static boolean vis[];
	static Stack<Integer> pila;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int n, m;
		for (String line; (line = in.readLine()) != null;) {
			st = new StringTokenizer(line);
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			nodos = n;
			aristas = m;
			vis = new boolean[n];
			lAdy = new ArrayList[n];
			for (int i = 0; i < n; lAdy[i] = new ArrayList<>(), i++)
				;

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(in.readLine());
				int u = Integer.parseInt(st.nextToken()) - 1;
				int v = Integer.parseInt(st.nextToken()) - 1;
				if (u != v) {
					lAdy[u].add(v);
					lAdy[v].add(u);
				}
			}

			int res[] = ts();
			out.println(res.length);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < res.length; i++) {
				sb.append((res[i] + 1) + " ");
			}
			out.println(sb.toString().trim());

		}
		out.close();
	}

	static int[] ts() {
		pila = new Stack<>();
		for (int i = 0; i < nodos; i++) {
			if (!vis[i])
				dfs(i);
		}
		int f[] = new int[nodos];
		for (int i = 0; i < f.length; i++) {
			f[i] = pila.pop();
		}
		return f;
	}

	static void dfs(int v) {
		vis[v] = true;
		for (int w : lAdy[v]) {
			if (!vis[w])
				dfs(w);
		}
		pila.push(v);
	}

}
