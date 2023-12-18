import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		List<Double> list = Arrays.stream(sc.nextLine().split(" ")).map(Double::valueOf).sorted()
				.collect(Collectors.toList());
		int size = list.size();
		double avg = list.get(0);
		for (int i = 1; i < size; i++) {
			avg = (avg + list.get(i)) / 2d;
		}
		System.out.println(avg);
	}
}
