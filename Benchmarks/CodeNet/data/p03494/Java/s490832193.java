import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=Integer.valueOf(sc.nextLine());
		List<Integer> numbers=Arrays.asList(sc.nextLine().split(" "))
				.parallelStream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int result=0;
		while(numbers.parallelStream().allMatch(i->i%2==0)) {
			result++;
			numbers=numbers.parallelStream().map(i->i/2).collect(Collectors.toList());
		}
		System.out.println(result);
	}
}