
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int s;
		int t;
		Pair(int s, int t){
			this.s=s;
			this.t=t;
		}
		@Override
		public String toString() {
			return "Pair [s=" + s + ", t=" + t + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + s;
			result = prime * result + t;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (s != other.s)
				return false;
			if (t != other.t)
				return false;
			return true;
		}
		private Main getOuterType() {
			return Main.this;
		}

	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
		ArrayList<ArrayList<Integer>> G = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N; i++) G.add(new ArrayList<Integer>());
		ArrayList<Pair> vp = new ArrayList<Pair>();


		for(int i=0; i<N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--; b--;
			G.get(a).add(b);
			G.get(b).add(a);
			vp.add(new Pair(a,b));
		}

		int K = 0;
		HashMap<Pair, Integer>I = new HashMap<Pair, Integer>();
		ArrayList<Integer> cs = new ArrayList<>();
		ArrayList<Boolean> used = new ArrayList<>();
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();

		for(int i=0; i<N; i++) {
			cs.add(0);
			used.add(false);
		}

		used.set(0, true);
		que.add(0);
		while(!que.isEmpty()) {
			int v = que.poll();
			if(K < G.get(v).size()) {
				K = G.get(v).size();
			}
			int cur=1;
			for(int u : G.get(v)) {
				if(used.get(u))	continue;
				if(cur == cs.get(v)) cur++;
				cs.set(u, cur);
				I.put(new Pair(u,v), cur);
				I.put(new Pair(v,u), cur);
				cur++;
				used.set(u, true);
				que.add(u);
			}
		}
		System.out.println(K);
		for(Pair p : vp) {
			System.out.println(I.get(p));
		}
		sc.close();
	}


}
