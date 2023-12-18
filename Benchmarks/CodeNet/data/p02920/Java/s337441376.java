import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = (int)Math.pow(2, n);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int prev = arr[0];
		int count = 1;
		for (int i = 1; i < size; i++) {
			if (prev == arr[i]) {
				count++;
			} else {
				list.add(count);
				count = 1;
			}
			prev = arr[i];
		}
		list.add(count);
		int idx = 0;
		for (int i = n - 1; i >= 0; i--) {
			int max = (int)Math.pow(2, i);
			while (max > list.get(idx)) {
				max -= list.get(idx);
				idx++;
			}
			if (list.get(idx) >= max * 2) {
				System.out.println("No");
				return;
			}
			list.set(idx, max - list.get(idx));
		}
		System.out.println("Yes");
	}
}
