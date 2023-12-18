
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		List<Integer> input=Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(Integer::parseInt)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(input.get(input.size()-1)-input.get(0));
	}
}
