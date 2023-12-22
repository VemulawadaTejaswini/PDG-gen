import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] z) {
		new Main();
	}
	
	class Edge{
		int from, to, c;
		public Edge(int u, int v, int c) {
			this.from = u;
			this.to = v;
			this.c = c;
		}
		@Override
		public boolean equals(Object obj) {
			Edge e = (Edge) obj;
			return to == e.to;
		}
	}

	public Main() {
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int[][] e = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
		for (;;) {
			int w = s.nextInt(), h = s.nextInt();
			if (w < 1) {
				break;
			}
			int[][] a = new int[h + 2][w + 2];
			List<List<Edge>> adj = new ArrayList<List<Edge>>();
			for (int i = 1; i <= h; ++i) {
				for (int j = 1; j <= w; ++j) {
					a[i][j] = 1 - s.nextInt();
					adj.add(new ArrayList<Edge>());
				}
			}
			for (int i = 1; i <= h; ++i) {
				for (int j = 1; j <= w; ++j) {
					for (int[] d : e) {
						if (a[i][j] == 1 && a[i + d[0]][j + d[1]] == 1) {
							int u = i * w + j - w - 1;
							int v = (i + d[0]) * w + j + d[1] - w - 1;
							adj.get(u).add(new Edge(u, v, 0));
						}
					}
				}
			}
			for(int i = 0; i < adj.size(); ++i){
				List<Edge> list = adj.get(i);
				if (list.size() == 2) {
					Edge u = list.get(0);
					Edge v = list.get(1);
					list.clear();
					List<Edge> ul = adj.get(u.to);
					List<Edge> vl = adj.get(v.to);
					++u.c;
					++v.c;
					ul.add(v);
					vl.add(u);
					ul.remove(new Edge(u.from, i, 0));
					vl.remove(new Edge(v.from, i, 0));
				}
			}
			int n = 0;
			boolean isHamilton = true;
			for(int i = 0; i < adj.size(); ++i){
			List<Edge> list = adj.get(i);
				if (list.size() > 1) {
					++n;
					List<Edge> tmp = new ArrayList<Edge>();
					for(Edge ed : list){
						if(ed.c > 0){
							tmp.add(ed);
						}
					}
					adj.set(i, tmp);
				}
			}
			for (List<Edge> list : adj) {
				if(!list.isEmpty() && list.size() %  2 > 0){
					isHamilton = false;
					break;
				}
			}
			pw.println(isHamilton ? "Yes" : "No");
		}
		pw.close();
	}

	class Scanner {
		java.io.BufferedInputStream bis;

		public Scanner(java.io.InputStream is) {
			bis = new java.io.BufferedInputStream(is);
		}

		public String next() {
			StringBuilder sb = new StringBuilder();
			int b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				for (; !Character.isWhitespace(b); b = bis.read()) {
					sb.append((char) b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return sb.toString();
		}

		public int nextInt() {
			int r = 0, s = 1, b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				if ((s = b == '-' ? -1 : 1) < 0) {
					b = bis.read();
				}
				for (; Character.isDigit(b); b = bis.read())
					r = r * 10 + b - '0';
			} catch (Exception e) {
			}
			return s * r;

		}
	}
}