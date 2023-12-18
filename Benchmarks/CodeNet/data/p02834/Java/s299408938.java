
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int u;
	public static int v;
	public static int ans = 0;
	public static int[] takadist;
	public static int[] aodist;
	public static List<Integer>[] path;
	public static int dist = 0;

	public static void Aocalc(int parent, int here) {
		aodist[here] = dist;
		dist++;
		for(Integer e : path[here]) {
			if(e != parent) {
				Aocalc(here, e);
			}
		}
	}

	public static void Takacalc(int parent, int here) {
		takadist[here] = takadist[parent] + 1;
		if(takadist[here] >= aodist[here]) {
			ans = Math.max(ans, aodist[here]);
		} else {
			for(Integer e : path[here]) {
				Takacalc(here, e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		takadist = new int[n + 1];
		aodist = new int[n + 1];
		for(int i = 0; i < n + 1; i++) {
			takadist[i] = n;
		}
		for(int i = 0; i < n + 1; i++) {
			aodist[i] = n;
		}
		path = new ArrayList[n + 1];
		u = sc.nextInt();
		v = sc.nextInt();
		takadist[u] = 0;
		aodist[v] = 0;
		for(int i = 1; i < n + 1; i++) {
			path[i] = new ArrayList<>();
		}
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			path[a].add(b);
			path[b].add(a);
		}
		Aocalc(v, v);
		Takacalc(u, u);
		System.out.println(ans);

	}

}
