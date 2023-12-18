import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] info = sc.nextLine().split(" ");
		int N=Integer.parseInt(info[0]);
		int K=Integer.parseInt(info[1]);
		Integer result=Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(Integer::valueOf)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList())
				.subList(0, K)
				.stream()
				.mapToInt(Integer::valueOf)
				.sum();
		System.out.println(result);
	}
}