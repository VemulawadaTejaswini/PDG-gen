import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (map.containsKey(a[i]) == true) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		long tmp = map.size() - k;
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < map.size(); i++) {
			array.add(a[i]);
		}
		Collections.sort(array);
		long ans = 0;
		for (int i = 0; i < tmp; i++) {
			ans += array.get(i);
		}
		System.out.println(ans);
	}
}