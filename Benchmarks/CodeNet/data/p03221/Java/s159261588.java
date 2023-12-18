import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, List<Integer>> yearCity = new TreeMap<>();

		for (int i = 1; i <= M; i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			yearCity.put(Y, new ArrayList<Integer>(Arrays.asList(i, P)));
		}

		int[] kenList = new int[N + 1];
		String[] outputList = new String[M + 1];
		for (List<Integer> city : yearCity.values()) {
			int cityID = city.get(0);
			int kenID = city.get(1);
			String output = String.format("%06d%06d", kenID, ++kenList[kenID]);
			outputList[cityID] = output;
		}

		for (int i = 1; i <= M; i++) {
			System.out.println(outputList[i]);
		}

	}
}