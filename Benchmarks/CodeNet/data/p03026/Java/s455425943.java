import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer,List<Integer>> map = new HashMap<>();
		for(int i=0;i<n-1;i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			if(map.containsKey(a)) map.get(a).add(b);
			else {
				List<Integer> list = new ArrayList<>();
				list.add(b);
				map.put(a, list);
			}
			if(map.containsKey(b)) map.get(b).add(a);
			else {
				List<Integer> list = new ArrayList<>();
				list.add(a);
				map.put(b, list);
			}
		}
		int[] c = new int[n];
		for(int i=0;i<n;i++) {
			c[i] = in.nextInt();
		}
		Arrays.sort(c);
		int sum = 0;
		int[] ans = new int[n];
		Deque<Integer> que = new ArrayDeque<>();
		ans[0] = c[n-1];
		for(int tmp : map.get(0)) {
			que.add(tmp);
		}
		for(int i=n-2;i>=0;i--) {
			sum += c[i];
			int num = que.poll();
			ans[num] = c[i];
			for(int tmp : map.get(num)) {
				if(ans[tmp]==0) que.add(tmp);
			}
		}
		System.out.println(sum);
		StringBuilder sb = new StringBuilder();
		sb.append(ans[0]);
		for(int i=1;i<n;i++) {
			sb.append(" ");
			sb.append(ans[i]);
		}
		System.out.println(sb.toString());
		in.close();

	}

}
