import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();

		Set<Long> lunlun = new TreeSet<>();
		List<Long> queue = new ArrayList<>();

		queue.add(1l);
		queue.add(2l);
		queue.add(3l);
		queue.add(4l);
		queue.add(5l);
		queue.add(6l);
		queue.add(7l);
		queue.add(8l);
		queue.add(9l);

		lunlun.addAll(queue);

		while (lunlun.size() <= K) {
			long num = queue.get(0);
			List<Long> temp = new ArrayList<>();
			if (num % 10 != 0) temp.add((num * 10) + (num % 10 - 1));
			temp.add((num * 10) + (num % 10));
			if (num % 10 != 9) temp.add((num * 10) + (num % 10 + 1));

			queue.addAll(temp);
			queue.remove(0);
			lunlun.addAll(temp);
		}

		List<Long> lunlunL = new ArrayList<>(lunlun);

		System.out.println(lunlunL.get(K - 1));

	}
}
