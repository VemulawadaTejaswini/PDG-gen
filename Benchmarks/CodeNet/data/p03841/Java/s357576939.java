import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i + 1;
			o.x = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> o1.x - o2.x);
		Queue<Integer> que = new ArrayDeque<>();
		for (Obj o : arr) {
			for (int i = 1; i < o.i; i++) {
				que.add(o.i);
			}
		}

		List<Integer> list = new ArrayList<>(n * n);
		int idx = 1;
		for (Obj o : arr) {
			while (idx < o.x) {
				if (que.isEmpty()) {
					System.out.println("No");
					return;
				}
				list.add(que.poll());
				idx++;
			}
			list.add(o.i);
			idx++;
			for (int i = o.i + 1; i <= n; i++) {
				que.add(o.i);
			}
		}

		System.out.println("Yes");
		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i).append(' ');
		}
		while (!que.isEmpty()) {
			sb.append(que.poll()).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static class Obj {
		int i, x;
	}
}
