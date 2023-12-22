import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int x = 1; x < 50; x++) {
			for (int y = 1; y < 50; y++) {
				for (int z = 1; z < 50; z++) {
					int num = (x + y + z) * (x + y + z) - (x * y + y * z + z * x);
					if (map.containsKey(num)) {
						map.put(num, map.get(num) + 1);
					} else {
						map.put(num, 1);
					}
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			if (map.containsKey(i)) {
				System.out.println(map.get(i));
			} else {
				System.out.println(0);
			}
		}
	}
}
