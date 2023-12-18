import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n,m;
	List<List<Integer>> graph;
	static int[] memo;//graph.get(i)の有向パスの最大を記録

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	private void solve() {
		n = nextInt();
		m = nextInt();
		graph = new ArrayList<List<Integer>>();
		for(int i=0;i<=n;i++)graph.add(new ArrayList<Integer>());
		for(int i=0;i<m;i++)graph.get(nextInt()).add(nextInt());

		memo = new int [n+1];
		Arrays.fill(memo, -1);
		for(int i=1;i<=n;i++)if(memo[i]<0)memo[i] = SearchVerticesPass(i);

		Arrays.sort(memo);
		System.out.println(memo[n]);
	}

	private int SearchVerticesPass(int vi) {
		if(memo[vi]>=0)return memo[vi];//
		List<Integer>V = graph.get(vi);
		int cntmax=0,t;
		for(int i=0;i<V.size();i++)if((t=SearchVerticesPass(V.get(i))+1)>cntmax)cntmax=t;
		memo[vi] = cntmax;
		return memo[vi];
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
} 