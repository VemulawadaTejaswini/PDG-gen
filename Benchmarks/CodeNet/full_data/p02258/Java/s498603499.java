import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int lowest = num;
		int highest = num;
		int prev = num;
		List<Integer> diffs = new ArrayList<Integer>();

		for (int i = 0; i < num - 1; i++) {
			int current = sc.nextInt();
			if (prev > current){
				// push
				diffs.add(highest - lowest);
				// reset
				lowest = prev;
				highest = prev;
			}

			if (current < lowest) {
				// make sure the
				lowest = current;
			}
			if (highest < current) {
				highest= current;
			}
		}
		// search biggest
		Collections.sort(diffs);
		System.out.println(diffs.get(0));

	}
}