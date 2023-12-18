
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			hmap.put(arr[i], i);

		}
		System.out.println(solve(hmap, arr, 0, n - 1));
	}

	public static int solve(HashMap<Integer, Integer> hmap, int[] arr, int i, int j) {
		if (i > j) {
			//System.out.println("pp " + i + " " + j);
			return 0;
		}
		int min = Integer.MAX_VALUE, idx = 0;
		//System.out.println(hmap + " " + i + " " + j);
		for (int k = i; k <= j; k++) {
			if (arr[k] < min) {
				min = arr[k];
				idx = k;
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int k = i; k <= j; k++) {
			arr[k] -= min;
		}

		for (int k = i; k <= idx - 1; k++) {
			map.put(arr[k], k);
		}
		int x = solve(map, arr, i, idx - 1);

		map = new HashMap<>();

		for (int k = idx + 1; k <= hmap.get(min) - 1; k++) {
			map.put(arr[k], k);
		}
		int y = solve(map, arr, idx + 1, hmap.get(min) - 1);
		
		map = new HashMap<>();

		for (int k = hmap.get(min) + 1; k <= j; k++) {
			map.put(arr[k], k);
		}

		int z = solve(map, arr, hmap.get(min) + 1, j);
		
		return x + y + z + min;
	}

}
