import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static HashSet<Integer>[] graph;
	static HashSet<Integer>[] graph2;
	static int[] place;
	static int t;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		graph = new HashSet[n + 1];
		graph2 = new HashSet[n + 1];
		place = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new HashSet<Integer>();
			graph2[i] = new HashSet<Integer>();
			place[i] = -1;
		}
		for (int i = 0; i < m; i++) {
			String[] line = br.readLine().split(" ", 2);
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			graph[a].add(b);
		}
		for (int i = 1; i <= n; i++) {
			for (int x : graph[i]) {
				for (int y : graph[x]) {
					for (int z : graph[y]) {
						graph2[i].add(z);
					}
				}
			}
		}
		String[] last = br.readLine().split(" ", 2);
		int s = Integer.parseInt(last[0]);
		t = Integer.parseInt(last[1]);
		next(s, 0);
		System.out.println(place[t]);
		
	}
	
	static void next(int idx, int num) {
		if (place[idx] != -1 && place[idx] <= num) {
			return;
		}
		place[idx] = num;
		if (idx == t) {
			return;
		}
		for (int x : graph2[idx]) {
			next(x, num + 1);
		}
	}
}
