import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int keihi = 0;

		Queue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int iranai = sc.nextInt();
			if(a >= n) count++;
			else queue.add(a);
		}

		if(count >= m - 1) System.out.println(0);
		else {
			for(int i = 0; i < m - 1 - count; i++) {
				keihi += n - queue.poll();
			}
			System.out.println(keihi);
		}
	}

}

