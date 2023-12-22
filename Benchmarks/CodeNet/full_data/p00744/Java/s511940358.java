
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	static class Node {
		int id;
		List<Node> link = new LinkedList<Node>();

		Node(int _id) {
			id = _id;
		}
	}
	boolean augment(final Node[] g, int u, int[] matchTo, boolean[] visited) {
		if (u < 0)
			return true;
		for (Node link : g[u].link)
			if (!visited[link.id]) {
				visited[link.id] = true;
				if (augment(g, matchTo[link.id], matchTo, visited)) {
					matchTo[u] = link.id;
					matchTo[link.id] =u;
					return true;
				}
			}
		return false;
	}

	int bipartiteMatching(final Node[] g, int L) {
		final int n = g.length;
		int[] matchTo = new int[n];
		Arrays.fill(matchTo, -1);
		int match = 0;
		for (int u = 0; u < L; u++) {
			boolean[] visited = new boolean[n];
			if (augment(g, u, matchTo, visited))
				++match;
		}
		return match;
	}
	int gcd(int a,int b){
		return b==0?a:gcd(b,a%b);
	}

	public void run() {
		while (true) {
			int m = sc.nextInt(), n = sc.nextInt();
			if (m == 0 && n == 0)return;
			int[] bs = new int[m],rs = new int[n];
			for (int i = 0; i < m; i++)bs[i] = sc.nextInt();
			for (int i = 0; i < n; i++)rs[i] = sc.nextInt();

			Node[] g=new Node[n+m];
			for (int i = 0; i < n+m; i++)g[i] =new Node(i);

			for(int i=0;i<m;i++)for(int j=0;j<n;j++){
				if(gcd(bs[i],rs[j])>1){
					g[i].link.add(g[m+j]);
					g[m+j].link.add(g[i]);
				}
			}
			ln(bipartiteMatching(g,m));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	static Scanner sc = new Scanner(in);

	// output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	// static String str(Double o){
	// return String.format("%.8f",o);
	// }
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":")
					.append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		// if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}