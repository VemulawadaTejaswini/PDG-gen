import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int key = sc.nextInt();
			int value = sc.nextInt();
			if (map.containsKey(key)) {
				value += map.get(key);
			}
			map.put(key, value);
		}
		int index = 0;
		for (Integer key : map.keySet().stream().sorted().toArray(Integer[]::new)) {
			index += map.get(key);
			if (K <= index) {
				System.out.println(key);
				return;
			}
		}
	}
}