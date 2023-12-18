import java.util.*;
import java.io.*;
public class Main {
	static long mod = 1000000007;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long k = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) g[i] = new ArrayList<>();
		for(int i = 0; i < n-1; i++){
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken())-1;
			int v = Integer.parseInt(st.nextToken())-1;
			g[u].add(v); g[v].add(u);
		}
		int[] count = new int[n];
		int[] count1 = new int[n];
		long[] ks = new long[n];
		boolean[] seen = new boolean[n];
		LinkedList<Integer> q = new LinkedList<>();
		seen[0] = true;
		q.add(0);
		while(!q.isEmpty()){
			int u = q.removeFirst();
			ks[u] = k - count[u];
			for(int v: g[u]){
				if(!seen[v]){
					count1[v]++;
					count1[u]++;
					count[v] = count1[u];
					seen[v] = true;
					q.add(v);
				}
			}
		}
		long res = 1;
		for(long p: ks) res = (res*p)%mod;
		System.out.println(res);
	}

}
