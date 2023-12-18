import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] lines = scanner.nextLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		long K = Long.parseLong(lines[1]);

		String[] arrays = scanner.nextLine().split(" ");
		int[] newArray = Stream.of(arrays).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < newArray.length; i++)
			array.add(newArray[i]);

		long P = 0;
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i) > array.get(j) && i < j)
					P++;
			}
		}

		long Q = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i) > array.get(j))
					Q++;
			}
		}

		long subQ = (K * (K - 1)) / 2;

		long ans = ((P * K) % 1000000007 + (Q * subQ) % 1000000007) % 1000000007;

		System.out.println(ans);

	}

}