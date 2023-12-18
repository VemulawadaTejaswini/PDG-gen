import java.util.*;

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int) obj1;
		int num2 = (int) obj2;

		if (num1 < num2) {
			return 1;
		} else if (num1 > num2) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		Queue q = new PriorityQueue(n, new MyComparator());

		int sum = 0;
		int day = 1;
		for (int j = 1; j <= m; j++) {
			for (int i = 0; i < n; i++) {
				if (a[i] == day) {
					q.add(b[i]);
				}
			}
			day++;
			sum += (int) q.poll();
		}

		System.out.println(sum);

		sc.close();

	}
}