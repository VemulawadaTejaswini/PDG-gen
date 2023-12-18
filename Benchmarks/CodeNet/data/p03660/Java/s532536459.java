import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer,List<Integer>> tree = new HashMap<>();
		for(int i=0;i<n-1;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(tree.containsKey(a)) tree.get(a).add(b);
			else {
				List<Integer> list = new ArrayList<>();
				list.add(b);
				tree.put(a, list);
			}
			if(tree.containsKey(b)) tree.get(b).add(a);
			else {
				List<Integer> list = new ArrayList<>();
				list.add(a);
				tree.put(b, list);
			}
		}
		in.close();
		int[] board = new int[n+1];
		board[1] = 1;
		board[n] = -1;
		Queue<Integer> que = new ArrayDeque<>();
		que.add(1);
		que.add(n);
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int next:tree.get(now)) {
				if(board[next]==0) {
					board[next] = board[now];
					que.add(next);
				}
			}
		}
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += board[i];
		}
		System.out.println(sum>0?"Fennec":"Snuke");
	}

}
