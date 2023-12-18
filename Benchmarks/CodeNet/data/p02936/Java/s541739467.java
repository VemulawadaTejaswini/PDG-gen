import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++){
			g[i] = new ArrayList<>();
		}
		for(int i = 0; i < n-1; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			g[a].add(b);
		}
		long[] vals = new long[n];
		for(int i = 0; i < Q; i++){
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken())-1;
			long x = Integer.parseInt(st.nextToken());
			vals[p] += x;
		}
		LinkedList<Integer> q = new LinkedList<>();
		q.add(0);
		while(!q.isEmpty()){
			int u = q.removeFirst();
			for(int v: g[u]){
				vals[v] += vals[u];
				q.add(v);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(vals[i]+" ");
		}
		bw.write(sb.toString().trim());
		bw.write("\n");
		bw.flush();
	}

}
