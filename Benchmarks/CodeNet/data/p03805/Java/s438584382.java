import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class NumTh{
    // Generate Permutation of n elements
    static List<List<Integer>> genPermutations(int n){
		if(n == 1) {
			List<Integer> elem = new ArrayList<Integer>();
			elem.add(1);
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			ans.add(elem);
			return ans;
		}
		List<List<Integer>> recPerm = genPermutations(n - 1); // (n - 1)!
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for(List<Integer> perm : recPerm) {
			for(int i = 0; i < n; i++) {
				List<Integer> newperm = new ArrayList<Integer>(n);
				for(int j = 0; j < n; j++) newperm.add(0);
				perm.add(i, n);
				Collections.copy(newperm, perm);
				ans.add(newperm);
				perm.remove(i);
			}
		}
		return ans;
	}
}

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		List<List<Integer>> perm = NumTh.genPermutations(N);
		int[][] adj = new int[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(adj[i], Integer.MAX_VALUE);
			adj[i][i] = 0;
		}
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
			adj[a][b] = 1;
			adj[b][a] = 1;
		}
		int ans = 0;
		for(List<Integer> p : perm) {
			boolean check = true;
			if(p.get(0) != 1) continue;
			for(int i = 0; i + 1 < p.size(); i++) {
				if(adj[p.get(i) - 1][p.get(i + 1) - 1] == Integer.MAX_VALUE) check = false;
			}
			if(check) ans++;
		}
		System.out.println(ans);
	}
}
