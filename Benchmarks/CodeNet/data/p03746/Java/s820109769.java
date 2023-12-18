import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer> lAdy[];
	static boolean visited[];
	static ArrayList<Integer> lista, final_;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int n, m;
		for (String line; (line = in.readLine()) != null;) {
			st = new StringTokenizer(line);
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			profMax = 0;
			lAdy = new ArrayList[n];
			visited = new boolean[n];
			lista = new ArrayList<>();
			final_ = new ArrayList<>();
			for (int i = 0; i < n; lAdy[i] = new ArrayList<>(), i++)
				;

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(in.readLine());
				int u = Integer.parseInt(st.nextToken()) - 1;
				int v = Integer.parseInt(st.nextToken()) - 1;
				lAdy[u].add(v);
				lAdy[v].add(u);				
			}
			for (int i = 0; i < lAdy.length; i++) {
				if(lAdy[i].size()>0){
					out.println(2);
					out.println((i+1)+" "+(lAdy[i].get(i)+1));
					break;
				}
			}
			

//			for (int i = 0; i < n; i++) {
//				if (!visited[i])
//					dfs(i);
//			}
//			out.println(final_.size());
//			StringBuilder sb = new StringBuilder();
//			for (Integer i : final_) {
//				sb.append((i+1)+" ");
//			}
//			out.println(sb.toString().trim());

		}
		out.close();
	}

	static int profMax;

	static void dfs(int v) {
		visited[v] = true;
		lista.add(v);
		if (lista.size() > profMax) {
			final_ = (ArrayList<Integer>) lista.clone();
			profMax=final_.size();
		}
		for (int i = 0; i < lAdy[v].size(); i++) {
			if (!visited[lAdy[v].get(i)]) {
				dfs(lAdy[v].get(i));
				visited[lAdy[v].get(i)] = false;
			}
			if (lista.get(lista.size() - 1) == lAdy[v].get(i)) {
				lista.remove(lista.size() - 1);
			}
		}
	}

}
