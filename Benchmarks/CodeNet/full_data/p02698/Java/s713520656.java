import java.util.*;

public class Main {
	static int N;
	static int[] a;
    static ArrayList<ArrayList<Integer>> edge;
    static ArrayList<ArrayList<Integer>> children;
    static int[] parent;
    static boolean[] visited;
    static int[] dp;

    static void dfs(int x, ArrayList<Integer> list) {
        if (visited[x]) return;
        visited[x] = true;
        int index = ~Collections.binarySearch(list, a[x], (o1, o2) -> o1>=o2 ? 1 : -1);
        // if (index<list.size()) list.set(index, a[x]);
        // else list.add(a[x]);
        int before_a_x = list.get(index);
        list.set(index, a[x]);
        dp[x] = ~Collections.binarySearch(list, 999_999_999, (o1, o2)-> o1>=o2 ? 1 : -1);

        for (Integer i : edge.get(x)) {
            if (!visited[i]) {
                children.get(x).add(i);
                parent[i] = x;
                dfs(i, list);
            }
        }

        list.set(index, before_a_x);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
        edge = new ArrayList<ArrayList<Integer>>();
        children = new ArrayList<ArrayList<Integer>>();
        parent = new int[N];
        parent[0] = -1;
        dp = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add_1 = new ArrayList<Integer>();
            ArrayList<Integer> add_2 = new ArrayList<Integer>();
            edge.add(add_1);
            children.add(add_2);
        }

		for (int i=0;i<N-1;i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
            edge.get(u).add(v);
            edge.get(v).add(u);
		}

        visited = new boolean[N];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int INF = 1_000_000_000;
        for (int i=0;i<N;i++) {
        	list.add(INF);
        }
        dfs(0, list);
        for (int i=0;i<N;i++) {
        	System.out.println(dp[i]);
        }
        // System.out.println(edge);
        // System.out.println(children);
	}
}