import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final long n = sc.nextLong();
			System.out.println(LongStream.range(1, n+1).parallel().map(i-> {
				return  i * LongStream.range(1, i+1).parallel().filter(k-> i%k==0).count();
			}).sum());
		}
	}
}