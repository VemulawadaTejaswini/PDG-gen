import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			PriorityQueue<Robot> pq = new PriorityQueue<>((o1, o2) -> {
				return Integer.compare(o1.end, o2.end);
			});
			for(int i = 0 ; i < n ; i++) {
				int x = sc.nextInt();
				int l = sc.nextInt();
				pq.add(new Robot(x - l + 1, x + l));
			}
			int ans = n;
			Robot before = null;
			while(!pq.isEmpty()) {
				if(before == null) {
					before = pq.poll();
				} else {
					Robot current = pq.poll();
					if(before.end >= current.start) {
						ans--;
					} else {
						before = current;
					}
				}
			}

			System.out.println(ans);
		}

	}

	private static class Robot {
		int start;
		int end;
		private Robot(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

}
