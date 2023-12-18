import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] lines = scanner.nextLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		String[] arrays = scanner.nextLine().split(" ");
		int[] newArray = Stream.of(arrays).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < newArray.length; i++)
			array.add(newArray[i]);

		int length = array.size();

		for (int i = 0; i < K - 1; i++) {
			for (int j = 0; j < length; j++) {
				array.add(array.get(j));
			}
		}
		
		
		int B = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i) > array.get(j))
					B++;
			}
		}

		System.out.println(B % 1000000007);

	}

}
