import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner br = new FastScanner();
		StringBuilder n = new StringBuilder(br.nt());
		StringBuilder m = new StringBuilder(n.toString());
		int cont1 = 0, cont2 = 0;
		for(int i = 1;i<n.length();i++) {
			if(n.charAt(i)==n.charAt(i-1)) {
				if(n.charAt(i)=='1')n.setCharAt(i, '0');
				else if(n.charAt(i)=='0')n.setCharAt(i, '1');
				cont1++;
			}
		}for(int i = n.length()-2;i>=0;i--) {
			if(m.charAt(i)==m.charAt(i+1)) {
				if(m.charAt(i)=='1')m.setCharAt(i, '0');
				else if(m.charAt(i)=='0')m.setCharAt(i, '1');
				cont2++;
			}
		}
		System.out.println(Math.min(cont1, cont2));
	}
}

class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	public FastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public FastScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	ArrayList<Integer>[] ng(int n, int e) {
		ArrayList<Integer>[] adj = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < e; i++) {
			int a = ni() - 1;
			int b = ni() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		return adj;
	}

	Integer[] nIa(int n) {
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ni();
		}
		return arr;
	}

	int[] nia(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ni();
		}
		return arr;
	}

	Long[] nLa(int n) {
		Long[] arr = new Long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nl();
		}
		return arr;
	}

	long[] nla(int n) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nl();
		}
		return arr;
	}

	String[] nsa(int n) {
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nt();
		}
		return arr;
	}

	String nt() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int ni() {
		return Integer.parseInt(nt());
	}

	long nl() {
		return Long.parseLong(nt());
	}

	double nd() {
		return Double.parseDouble(nt());
	}

}