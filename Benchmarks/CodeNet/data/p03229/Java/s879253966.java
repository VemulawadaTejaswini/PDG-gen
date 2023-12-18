import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> q = new ArrayDeque<Integer>();
		int n = scan.nextInt();

		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			A.add(scan.nextInt());
		}
		for (int i : A) {
			B.add(i);
		}
		Collections.sort(A);
		Collections.sort(B, Comparator.reverseOrder());
		int c = 0;
		q.addFirst(A.get(0));
		while (q.size() < n) {
			if (c % 2 == 0) {
				q.addFirst(B.get(c));
				c++;
				q.addLast(B.get(c));
			} else {
				q.addLast(A.get(c));
				c++;
				q.addFirst(A.get(c));
			}
		}
		if (n%2== 0) {
			if (n%4==0) {
				int f = q.removeLast();
				q.removeLast();
				q.addFirst(f);
			} else {
				int f = q.removeFirst();
				q.removeLast();
				q.addLast(f);
			}
		}
		//System.out.println(q.toString());
		int ans = 0;
		for (int i = 1; i < n; i++) {
			int x = q.removeFirst();
			int y = q.peekFirst();
			ans = ans + Math.abs(x-y);
		}
		System.out.println(ans);
	}
}
