import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		Map<Integer, List<Integer>> map = new HashMap<>();
		int[] ans = new int[n];
		for(int i = 1;i<=n;i++) {
			map.put(i,new ArrayList<>());
		}
		for(int i = 1;i<n;i++) {
			map.get(scn.nextInt()).add(scn.nextInt());
		}
		for(int i = 0;i<q;i++) {
			int bace = scn.nextInt();
			List<Integer> next = map.get(bace);
			List<Integer> list = new ArrayList<>();
			list.addAll(next);
			list.add(bace);
			while(next.size()!=0) {
				List<Integer> next1 = next;
				next = new ArrayList<>();
				for(int num:next1) {
					next.addAll(map.get(num));
				}
				list.addAll(next);
			}
			int x = scn.nextInt();
			for(int num:new LinkedHashSet<Integer>(list)) {
				ans[num-1] += x;
			}
		}
		for(int i:ans) {
			System.out.print(i + " ");
		}
		scn.close();
	}
}