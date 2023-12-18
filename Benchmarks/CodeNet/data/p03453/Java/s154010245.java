import java.util.*;
import java.io.*;

//dijkstraのqに同じノードが繰り返し入りうる事を理解していないと、数え上げで間違える。
public class Main {
	static int mod = (int) 1e9 + 7;
	static int N, M , S , T;
	static List<ArrayList<int[]>> to;
	static long distFromS[], distFromT[];
	static long numFromS[], numFromT[];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		N = fs.nextInt();
		M = fs.nextInt();
		S = fs.nextInt()-1;
		T = fs.nextInt()-1;
		to = new ArrayList<>();
		for(int i=0;i<N;i++) to.add(new ArrayList<>());
		for(int i=0;i<M;i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1, d = fs.nextInt();
			int t1[] = {v, d}, t2[] = {u, d};
			to.get(u).add(t1);
			to.get(v).add(t2);
		}
		
		distFromS = new long[N];
		distFromT = new long[N];
		long INF = Long.MAX_VALUE/3;
		Arrays.fill(distFromS, INF);
		Arrays.fill(distFromT, INF);
		numFromS = new long[N];
		numFromT = new long[N];
		distFromS[S] = 0;
		distFromT[T] = 0; 
		numFromS[S] = 1;
		numFromT[T] = 1; 
		dijkstra(S);
		dijkstra(T);
		
		//全パターン
		long all = numFromS[T] * numFromT[S] % mod;
		//頂点で出会う場合
		long vmeet = 0;
		for(int i=0;i<N;i++) {
			if(distFromS[i]==distFromT[i]) {
				long tmp = numFromS[i] * numFromT[i]%mod;
				vmeet += (tmp*tmp%mod);
				vmeet %= mod;
			}
		}
		//辺で出会う場合
		long emeet = 0;
		long minT = distFromS[T];
		for(int i=0;i<N;i++) {
			for(int t[]:to.get(i)) {
				int next = t[0]; // node: i -> next
				if(distFromS[i]<minT/2 && distFromS[next]>minT/2 && distFromT[next]<minT/2 && distFromT[i]>minT/2) {
					long tmp = numFromS[i] * numFromT[next]%mod;
					emeet += (tmp * tmp %mod);
					emeet %= mod;
				}
			}
		}
		long ans = (all - (vmeet + emeet)%mod + mod)%mod;
		System.out.println(ans);
	}
	static void dijkstra(int v) {
		long dist[];
		long num[];
		if(v == S) {
			dist = distFromS;
			num = numFromS;
		}else {
			dist = distFromT;
			num = numFromT;
		}
		
		PriorityQueue<long[]> q = new PriorityQueue<>((i1,i2)-> i1[1] > i2[1] ? 1 :-1); //最短距離が小さい順に出てくる。
		long start[] = {v, 0}; 
		q.offer(start);
		while(!q.isEmpty()) {
			long now[] = q.poll();
			
			
			int now_v = (int)now[0];
			//通常のdijkstraと違って、経路数も一緒にカウントするためqに同じノードが2つ入ってるとまずい。
			//そこでその場合は、古い物は距離が最短になっていないはずなので、最新のdistと見比べて、処理しないことにする。
			long now_dist = now[1];
			if(now_dist > dist[now_v] ) continue;
			for(int next[]:to.get(now_v)) {
				int next_v = (int)next[0];
				long now_to_next_dist = next[1];
				if(dist[next_v] > dist[now_v] + now_to_next_dist) {
					dist[next_v] = dist[now_v] + now_to_next_dist;
					long tmp[] = {next_v, dist[next_v]};
					q.offer(tmp);
					num[next_v] = num[now_v];
				}
				else if(dist[next_v] == dist[now_v] + now_to_next_dist) {
					num[next_v] += num[now_v];
					num[next_v] %= mod;
				}
			}
		}
		
			
	}	
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

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

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
