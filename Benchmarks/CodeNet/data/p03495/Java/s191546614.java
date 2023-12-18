import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			int A = reader.nextInt();
			int value = 1;
			if (map.containsKey(A)) {
				value += map.get(A);
			}
			map.put(A, value);
		}
		int arr[] = new int[map.size()];
		int count = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			arr[count] = entry.getValue();
			count++;
		}
		Arrays.sort(arr);

		for (int i = 0; i < map.size() - K; i++) {
			ans += arr[i];
		}

		System.out.print(ans);
		reader.close();
	}
}



