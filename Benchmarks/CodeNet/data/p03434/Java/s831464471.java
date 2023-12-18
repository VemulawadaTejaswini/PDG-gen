import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		int n = sc.nextInt();
		for(int i = 0;i < n; i++) {
			que.add(-1*sc.nextInt());
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) ans -= que.poll();
			else ans += que.poll();
		}
		System.out.println(ans);
		sc.close();
	}
}