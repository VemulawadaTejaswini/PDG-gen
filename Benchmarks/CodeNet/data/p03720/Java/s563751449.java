import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] city = new int[M * 2];
		for (int i = 0; i < M * 2; i++) {
			city[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> cityMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < city.length; i++) {
			int temp = city[i];
			if (cityMap.containsKey(temp)) {
				int value = cityMap.get(temp);
				cityMap.put(temp, ++value);
			} else {
				cityMap.put(temp, 1);
			}
		}

		for (int i = 1; i <= cityMap.size(); i++) {
			int counter = cityMap.get(i);
			System.out.println(counter);
		}
	}
}

