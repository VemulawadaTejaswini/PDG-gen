import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String[] input;
		int i;
		int N, M;
		int p;
		int q;
		int c;
		HashMap<Integer, ArrayList<Pair<Integer, Integer>>> station = new HashMap<Integer, ArrayList<Pair<Integer, Integer>>>();
		HashSet<Pair<Integer, Integer>> pq = new HashSet<Pair<Integer, Integer>>();
		Dijkstra<Pair<Integer, Integer>> dijkstra = new Dijkstra<Pair<Integer, Integer>>();

		buf = br.readLine();
		input = buf.split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		for(i=1;i<=N;i++) {
			station.put(i, new ArrayList<Pair<Integer, Integer>>());
		}

		for(i=0;i<M;i++) {
			buf = br.readLine();
			input = buf.split(" ");
			p = Integer.parseInt(input[0]);
			q = Integer.parseInt(input[1]);
			c = Integer.parseInt(input[2]);
			Pair<Integer, Integer> pair;
			if(p < q) {
				pair = new Pair<Integer, Integer>(p, q);
			} else {
				pair = new Pair<Integer, Integer>(q, p);
			}
			if(!pq.contains(pair)) pq.add(pair);
			Pair<Integer, Integer> pc = new Pair<Integer, Integer>(p, c);
			Pair<Integer, Integer> qc = new Pair<Integer, Integer>(q, c);
			if(!station.get(p).contains(pc)) station.get(p).add(pc);
			if(!station.get(q).contains(qc)) station.get(q).add(qc);
		}

		for(Pair<Integer, Integer> pair : pq) {
			for(Pair<Integer, Integer> u : station.get(pair.first)) {
				for(Pair<Integer, Integer> v : station.get(pair.second)) {
					if(u.second == v.second) {
						dijkstra.input(u, v, 0, true);
					}
				}
			}
		}

		for(i=1;i<=N;i++) {
			Pair<Integer, Integer> outside = new Pair<Integer, Integer>(i, -1);
			for(Pair<Integer, Integer> u : station.get(i)) {
				dijkstra.input(u, outside, 0, false);
				dijkstra.input(outside, u, 1, false);
			}
		}

		Pair<Integer, Integer> start = new Pair<Integer, Integer>(1, -1);
		Pair<Integer, Integer> end = new Pair<Integer, Integer>(N, -1);
		Pair<Integer, Pair<Integer, Integer>> ans = dijkstra.solve(start, end);

		if(ans.second == null) {
			System.out.println(-1);
		} else {
			System.out.println(ans.first);
		}
	}

}

class Dijkstra<E> {
	HashMap<E, Integer> d = new HashMap<E, Integer>();
	HashMap<E, E> prev = new HashMap<E, E>();
	TreeSet<Pair<E, Integer>> Q = new TreeSet<Pair<E, Integer>>(
			new Comparator<Pair<E, Integer>>() {
				@Override
				public int compare(Pair<E, Integer> o1, Pair<E, Integer> o2) {
					if(o1.second < o2.second) return -1;
					else if(o1.second > o2.second) return 1;
					else {
						if(o1.equals(o2)) return 0;
						else return 1;
					}
				}
			});
	HashMap<E, HashMap<E, Integer>> list = new HashMap<E, HashMap<E, Integer>>();

	Dijkstra() {

	}

	void input(E u, E v, int cost, boolean isDig) {
		if(!list.containsKey(u)) list.put(u, new HashMap<E, Integer>());
		list.get(u).put(v, cost);

		if(isDig) {
			if(!list.containsKey(v)) list.put(v, new HashMap<E, Integer>());
			list.get(v).put(u, cost);
		}
	}

	Pair<Integer, E> solve(E start, E end) {
		for(E node : list.keySet()) {
			d.put(node, node.equals(start) ? 0 : Integer.MAX_VALUE);
			prev.put(node, null);
			Q.add(new Pair<E, Integer>(node, d.get(node)));
		}

		while(!Q.isEmpty()) {
			E u = Q.pollFirst().first;
			int alt;
			for(E v : list.get(u).keySet()) {
				alt = d.get(u) + list.get(u).get(v);
				if(d.get(v) > alt) {
					d.put(v, alt);
					prev.put(v, u);
					Q.add(new Pair<E, Integer>(v, alt));
				}
			}
		}

		return new Pair<Integer, E>(d.get(end), prev.get(end));
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

    @Override
    public String toString() {
    	return "(" + first.toString() + "," + second.toString() + ")";
    }
}
