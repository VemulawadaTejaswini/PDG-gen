import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List<String> divisor = new ArrayList<>();
//		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = Integer.parseInt(sc.next());
//		int S = Integer.parseInt(sc.next());
//		String[] S = sc.next().split("");
		
//		for (int i = 1; i <= N; i++) {
//		}
		
		int num = 1;
		List<Integer> divisor = new ArrayList<>();
		for (int i = 1; i <= N; i++) 
			num = num * i;
		 
		for (int i = 1; i <= num; i++) 
			if (num % i == 0) divisor.add(num);
		
		System.out.println(divisor.size());
	}
}
