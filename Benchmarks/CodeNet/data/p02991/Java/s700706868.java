import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static ArrayList<Integer>[] graph;
	static int[] place;
	static int t;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		graph = new ArrayList[n + 1];
		place = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
			place[i] = -1;
		}
		for (int i = 0; i < m; i++) {
			String[] line = br.readLine().split(" ", 2);
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			graph[a].add(b);
		}
		String[] last = br.readLine().split(" ", 2);
		int s = Integer.parseInt(last[0]);
		t = Integer.parseInt(last[1]);
		next(s, 0, 0);
		System.out.println(place[t]);
		
	}
	
	static void next(int idx, int num, int cnt) {
		if (cnt == 0) {
			if (place[idx] != -1 && place[idx] <= num) {
				return;
			}
			place[idx] = num;
			if (idx == t) {
				return;
			}
			num++;
			cnt = 3;
		}
		for (int x : graph[idx]) {
			next(x, num, cnt - 1);
		}
	}
}
