import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();

		Deque<String> nameQueue = new ArrayDeque<String>();
		Deque<Integer> timeQueue = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			nameQueue.offer(sc.next());
			timeQueue.offer(sc.nextInt());
		}
		int nowTime = 0;

		while (!nameQueue.isEmpty() && !timeQueue.isEmpty()) {
			String p = nameQueue.poll();
			int t = timeQueue.poll();
			if (t - q <= 0) {
				nowTime += t;
				System.out.println(p + " " + String.valueOf(nowTime));
			} else {
				nameQueue.offer(p);
				timeQueue.offer(t - q);
				nowTime += q;
			}
		}

		sc.close();
	}
}