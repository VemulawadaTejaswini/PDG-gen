import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int left = 1;
		int right = n - 1;
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		deq.add(arr[0]);
		for (int i = 0; i < n - 1; i++) {
			if (i % 4 < 2) {
				if (i % 2 == 0) {
					deq.addFirst(arr[right]);
					right--;
				} else {
					deq.addLast(arr[right]);
					right--;
				}
			} else {
				if (i % 2 == 0) {
					deq.addFirst(arr[left]);
					left++;
				} else {
					deq.addLast(arr[left]);
					left++;
				}
			}
		}
		long total = 0;
		int prev = deq.poll();
		while (deq.size() > 0) {
			int x = deq.poll();
			total += Math.abs(x - prev);
			prev = x;
		}
		System.out.println(total);
	}
}
