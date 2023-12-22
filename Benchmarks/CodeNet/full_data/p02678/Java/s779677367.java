import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer> preList = new ArrayList<>();
	static List<Integer> distList = new ArrayList<>();
	static List<List<Integer>> to = new ArrayList<>();

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();

			for (int i = 0; i < N; i++) {
				to.add(new ArrayList<>());
				preList.add(-1);
				distList.add(-1);
			}
			for(int i = 0; i < M; i++) {
				int A = scanner.nextInt() - 1;
				int B = scanner.nextInt() - 1;
				to.get(A).add(B);
				to.get(B).add(A);
			}

	        Deque<Integer> queue = new ArrayDeque<>();
	        distList.set(0, 0);
	        queue.add(0);
	        while (!queue.isEmpty()) {
	            int v = queue.poll();
	            // 行くことができる行き先を一通り調べる
	            for (int u : to.get(v)) {
	            	// すでに距離がわかっている要素に関しては処理を行わない
	            	if (distList.get(u) != -1) {continue;}
	            	distList.set(u, distList.get(v) + 1);
	            	preList.set(u, v);
	            	queue.add(u);
	            }
	        }
	        System.out.println("Yes");
	        for (int i = 0, len = preList.size(); i < len; i++) {
	        	if (i == 0) {continue;}
	        	System.out.println(preList.get(i) + 1);
	        }
		}
	}
}