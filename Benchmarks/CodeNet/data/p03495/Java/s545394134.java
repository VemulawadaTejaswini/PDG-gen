import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0 && arr[i - 1] != arr[i]) {
				list.add(count);
				count = 1;
			} else {
				count++;
			}
		}
		if (count != 0) {
			list.add(count);
		}
		
		Collections.sort(list);
		int total = 0;
		while (list.size() > k) {
			total += list.get(0);
			list.remove(0);
		}
		System.out.println(total);
	}
}
