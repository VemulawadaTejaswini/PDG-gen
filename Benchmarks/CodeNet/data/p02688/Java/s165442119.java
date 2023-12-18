
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		//HashMap<Integer, Integer> sunukeMap = new HashMap<Integer, Integer>();
		int[] sunukeArray = new int[N+1];
		for (int i = 0; i < sunukeArray.length; i++) {
			sunukeArray[i] = 0;
		}
		for (int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for (int j = 1; j <= d; j++) {
				sunukeArray[sc.nextInt()]++;

				//				if (sunukeMap.containsKey(j)) {
				//					int value = sunukeMap.get(j);
				//					sunukeMap.put(j, ++value);
				//				} else {
				//					sunukeMap.put(j, 1);
				//				}

			}
		}
		int counter = 0;
		for (int i = 1; i < sunukeArray.length; i++) {
			if (sunukeArray[i] == 0) {
				counter++;
			}
		}
		System.out.print(counter);

	}
}
