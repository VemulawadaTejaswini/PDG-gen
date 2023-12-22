import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute20_3();
	}

	private static void execute20_3() {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int m = sc.nextInt();
			
			int[] hnum= new int[h];
			int[] wnum= new int[w];
			Map<Integer, List<Integer>> put = new HashMap<>();
			for (int i = 0; i < m; i++) {
				Integer hb = sc.nextInt()-1;
				Integer wb = sc.nextInt()-1;
				hnum[hb]++;
				wnum[wb]++;
				List<Integer> list = put.getOrDefault(hb, new ArrayList<Integer>());
				list.add(wb);
				put.put(hb, list);
			}
			int ans=0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int minus = 0;
					if(put.getOrDefault(i, new ArrayList<Integer>()).contains(j)) {
						minus=1;
					}
					ans = Math.max(ans, hnum[i]+wnum[j]-minus);
				}
			}
			System.out.println(ans);
		}
	}
}