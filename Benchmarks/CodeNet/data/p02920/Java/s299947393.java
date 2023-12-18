import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, NN;
	Integer[] S;
	TreeSet<Slime> slimes;
	Slime[] indices;
	Comparator<Slime> order;
	
	static class Slime {
		int id, val;
		Slime(int id) {
			this.id = id;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
		order = Comparator.comparingInt( (Slime s) -> (0x7fffffff & (-lsb(s.id))) ).
				thenComparingInt( s -> countOnes(s.id) ).
				thenComparingInt( s -> s.id );
	}
	
	private void calc() {
		N = sc.nextInt();
		NN = 1<<N;
		S = new Integer[NN];
		for (int i = 0; i < NN; i++) S[i] = sc.nextInt();
		Arrays.sort(S, Comparator.reverseOrder());
		slimes = new TreeSet<Slime>(order);
		indices = new Slime[NN];
		for (int i = 0; i < NN; i++) indices[i] = new Slime(i);
		slimes.add(indices[0]);
		indices[0].id = NN;
		Iterator<Slime> it = null;
		int lasts = Integer.MAX_VALUE;
		List<Slime> next = new ArrayList<>();
	lp:
		for (int j = 0; j < NN; j++) {
			if (lasts != S[j]) {
				slimes.addAll(next);
				next.clear();
				it = slimes.iterator();
			}
			while (it.hasNext()) {
				Slime s = it.next();
				if (j == 0 || indices[s.id ^ lsb(s.id)].val > S[j]) {
					s.val = S[j];
					it.remove();
					lasts = S[j];
					for (int l = (lsb(s.id) >>> 1); l > 0; l = l >>> 1)
						next.add(indices[(s.id | l)&(NN-1)]);
					continue lp;
				}
			}
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
	
	static int countOnes(int t) {
		t = (t & 0x55555555) + (t >> 1 & 0x55555555);
		t = (t & 0x33333333) + (t >> 2 & 0x33333333);
		t = (t & 0x0f0f0f0f) + (t >> 4 & 0x0f0f0f0f);
		t = (t & 0x00ff00ff) + (t >> 8 & 0x00ff00ff);
		return (t & 0x0000ffff) + (t >>16 & 0x0000ffff);
	}
	
	static int lsb(int t) {
		return t&(-t);
	}
	public static void main(String[] args) {
		new Main().calc();
	}
}
