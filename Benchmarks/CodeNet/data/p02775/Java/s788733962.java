import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("");
		List<Integer> list = Arrays.stream(input).map(Integer::valueOf).collect(Collectors.toList());
		list.add(0, 0);
		list.add(0);

		int sum = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			int val = list.get(i);
			if (val >= 10) {
				list.add(i - 1, (list.remove(i - 1) + 1));
				sum --;
			} else if (val <= 5) {
				sum += val;
			} else {
				sum += (10 - val);
				list.add(i - 1, (list.remove(i - 1) + 1));
			}
		}
		System.out.println(sum);
	}
}
