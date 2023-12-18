import java.io.*;
import java.util.*;


public class Main {

	static int N, M;
	static List<TreeMap<Integer, Integer>> list = new ArrayList<TreeMap<Integer, Integer>>();
	static Set<Pair<Integer, Integer>> all = new HashSet<Pair<Integer, Integer>>();
	static Set<Pair<Integer, Integer>> check = new HashSet<Pair<Integer, Integer>>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String[] input;
		int i, j;
		int cnt = 0;
		int ans = 0;
		
		buf = br.readLine();
		input = buf.split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		for(i=0;i<=N;i++) list.add(new TreeMap<Integer, Integer>());
		for(i=0;i<M;i++) {
			int u, v, dis;
			buf = br.readLine();
			input = buf.split(" ");
			u = Integer.parseInt(input[0]);
			v = Integer.parseInt(input[1]);
			dis = Integer.parseInt(input[2]);
			list.get(u).put(v, dis);
			list.get(v).put(u,  dis);
			all.add(new Pair<Integer, Integer>(u, v));
			all.add(new Pair<Integer, Integer>(v, u));
			cnt++;
		}
		
		for(i=1;i<=N;i++) {
			for(j=1;j<=N;j++) {
				if(i == j) continue;
				Dijkstra(i, j);
			}
		}
		
		for(Pair<Integer, Integer> pair : all) {
			if(!check.contains(pair)) {
				ans++;
			}
		}
		
		//System.out.println((2*cnt - check.size()) / 2);
		System.out.println(ans / 2);
	}
	
	static int Dijkstra(int s, int g) {
		int i;
		int[] d = new int[101]; //スタートノードから各ノードへの距離
		int[] prev = new int[101]; //各ノードの立ち寄る前のノード
		TreeSet<Pair<Integer, Integer>> Q = new TreeSet<Pair<Integer, Integer>>(
				new Comparator<Pair<Integer, Integer>>() {
					@Override
					public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
						if(o1.second < o2.second) return -1;
						else if(o1.second > o2.second) return 1;
						else return 0;
					}
				});
		//頂点uの隣接ノードv（key）とその距離（value）

		for(i=1;i<=N;i++) {
			d[i] = i == s ? 0 : Integer.MAX_VALUE;
			prev[i] = -1;
			Q.add(new Pair<Integer, Integer>(i, d[i]));
		}

		while(!Q.isEmpty()) {
			int u = Q.pollFirst().first;
			//System.out.println("u: " + u);
			int alt;
			for(Integer v : list.get(u).keySet()) {
				alt = d[u] + list.get(u).get(v);
				if(d[v] > alt) {
					d[v] = alt;
					prev[v] = u;
					Q.add(new Pair<Integer, Integer>(v, alt));
				}
			}
		}
		
		int t = g;
		while(t != s) {
			int p = prev[t];
			check.add(new Pair<Integer, Integer>(t, p));
			check.add(new Pair<Integer, Integer>(p, t));
			t = p;
		}
		
		return d[g];
	}

}

class Pair<F, S> {
    public final F first;
    public final S second;

    Pair (F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals (Object obj) {
        if (! (obj instanceof Pair))
            return false;
        @SuppressWarnings("unchecked")
		Pair<F, S> pair = (Pair<F, S>) obj;
        return (first.equals (pair.first) && second.equals (pair.second));
    }

    @Override
    public int hashCode () {
        return first.hashCode () ^ second.hashCode ();
    }
}
