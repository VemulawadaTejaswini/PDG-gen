import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < k; i++) {
			set.add(arr[i]);
		}
		int count = 1;
		int sCount = 0;
		for (int i = k; i < n; i++) {
			if (set.first() == arr[i - k] && set.last() < arr[i]) {
				
			} else {
				boolean flag = true;
				for (int j = i - k + 1; j < i; j++) {
					if (arr[j] > arr[j + 1]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					sCount++;
				}
				count++;
			}
			set.remove(arr[i - k]);
			set.add(arr[i]);
		}
		if (sCount > 1) {
			count = count - sCount + 1;
		}
		System.out.println(count);
	}
}
