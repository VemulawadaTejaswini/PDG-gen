import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N;
	int NN;
	Integer[] S;
	Integer[] idx;
	int[] ridx;
	
	Comparator<Integer> hier = (a,b) -> {
		int ba = countOnes(a);
		int bb = countOnes(b);
		if (ba != bb) return ba-bb;
		return Integer.compare(b,a);
	};
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		NN = 1<<N;
		S = new Integer[NN];
		for (int i = 0; i < NN; i++) S[i] = sc.nextInt();
		Arrays.sort(S, Comparator.reverseOrder());
		idx = new Integer[NN];
		for (int i = 0; i < NN; i++) idx[i] = i;
		Arrays.sort(idx, hier);
		ridx = new int[NN];
		for (int i = 0; i < NN; i++) ridx[idx[i]] = i;
		
		for (int i = 1; i < NN; i++) {
			int parent = idx[i] ^ lsb(idx[i]);
			if (S[ridx[parent]] <= S[i]) {
				System.out.println("No");
				return;
			}
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

