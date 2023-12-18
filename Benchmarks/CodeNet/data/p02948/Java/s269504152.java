import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Job> que1 = new PriorityQueue<>((x, y) -> x.day - y.day);
		PriorityQueue<Job> que2 = new PriorityQueue<>((x, y) -> y.s - x.s);
		for (int i = 0; i < n; i++) {
			que1.add(new Job(sc.nextInt(), sc.nextInt()));
		}
		long ans = 0;
		for (int i = 1; i <= m; i++) {
			while (!que1.isEmpty()) {
				if (que1.peek().day == i) {
					que2.add(que1.poll());
				} else {
					break;
				}
			}
			if (que2.isEmpty()) {
			} else {
				ans += que2.poll().s;
			}
		}
		System.out.println(ans);
	}
}

class Job {
	int day;
	int s;

	public Job(int day, int s) {
		this.day = day;
		this.s = s;
	}
}
