import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		while (sc.hasNextInt()) {
			int input = sc.nextInt();
			a.add(input);
		}
		List<Integer> b = new ArrayList<>();
		while (sc.hasNextInt()) {
			int input = sc.nextInt();
			b.add(input);
		}
		List<Integer> c = new ArrayList<>();
		while (sc.hasNextInt()) {
			int input = sc.nextInt();
			c.add(input);
		}
		int size = a.size();
		int sum = 0;
		int beforeA = 0;
		for (int i = 0; i < size; i++) {
			int tempA = a.get(0) - 1;
			sum += b.get(tempA);
			if (beforeA + 1 == tempA) {
				sum += c.get(beforeA);
			}
			beforeA = tempA;
		}
		System.out.println(sum);
	}
}
