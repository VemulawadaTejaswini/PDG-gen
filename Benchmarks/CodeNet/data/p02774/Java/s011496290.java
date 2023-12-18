import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n  = Integer.parseInt(tmp[0]);
		long k = Long.parseLong(tmp[1]) - 1;

		String[] num = scanner.nextLine().split(" ");
		long[] list   = new long[n];

		for(int i = 0; i < n; i++)
			list[i] = Long.parseLong(num[i]);

		Queue<Long> q = new PriorityQueue<Long>();

		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				q.add(list[i] * list[j]);

		long limit = n*(n-1)/2;
		long now = 0;

		for(int i = 0; i < limit; i++) {

			now = q.poll();
			if(i == k) {System.out.println(now);return;}

		}
	}
}