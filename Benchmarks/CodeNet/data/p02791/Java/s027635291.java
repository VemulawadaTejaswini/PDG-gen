import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			PriorityQueue<Integer> q = new PriorityQueue<>();
			int ans = 0;
			for(int i = 0 ; i < n ; i++) {
				int now = sc.nextInt();
				q.add(now);
				if(now == q.peek()) {
					ans++;
				}
			}

			System.out.println(ans);
		}

	}

}
