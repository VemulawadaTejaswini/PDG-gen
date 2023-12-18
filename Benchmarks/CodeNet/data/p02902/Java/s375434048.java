//だめだけど、メモのため
import java.util.*;
public class Main {
	static int n, m, start;
	static List<Integer> graph[];
	static boolean used[], ok;
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		graph = new ArrayList[n];
		for(int i=0;i<n;i++)graph[i] = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1;
			graph[a].add(b);
			graph[b].add(a);
		}
		used = new boolean[n];
		for(int i=0;i<n;i++) {
			Arrays.fill(used, false);
			start = i;
			ok = false;
			dfs(i);
			if(ok)return;
		}
		System.out.println(-1);
	}
	static void dfs(int v) {
		used[v] = true;
		for(int to:graph[v]) {
			if(start == to) {
				//t帰りがけでprintしていく。
				ok = true;
				break;
			}
			if(used[to])continue;
			dfs(to);
		}
		if(ok) {
			System.out.println(v+1);
		}
	}
}
