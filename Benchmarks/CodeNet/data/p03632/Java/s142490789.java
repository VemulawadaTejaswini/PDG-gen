import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		IntStream alices = IntStream.rangeClosed(sc.nextInt(), sc.nextInt());
		List<Integer> bobs = IntStream.rangeClosed(sc.nextInt(), sc.nextInt()).boxed().collect(Collectors.toList());
		sc.close();
		Long count = alices.filter(alice -> bobs.contains(alice)).count();
		System.out.println(count);
	}
}
