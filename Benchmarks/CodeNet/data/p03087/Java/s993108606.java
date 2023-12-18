import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		String s = sc.next();

		Deque<Integer> queue = new ArrayDeque<>();

		for (int i = 0; i < q; i++) {
			queue.add(Integer.parseInt(sc.next()) - 1);
			queue.add(Integer.parseInt(sc.next()) - 1);
		}

		for (int i = 0; i < q; i++) {
			int l = queue.poll();
			int r = queue.poll();
			int count = 0;

			for (int j = l; j < r && j < n - 1; j++) {
				if (s.charAt(j) == 'A' && s.charAt(j + 1) == 'C') {
					count++;
				}
			}

			System.out.println(count);
		}

		sc.close();
	}
}