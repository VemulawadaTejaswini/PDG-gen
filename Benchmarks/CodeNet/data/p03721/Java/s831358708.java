import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Long> array = new ArrayList<>();
		long N ;
		long number;
		long count;
		int K;


		N = scan.nextLong();
		K = scan.nextInt();


		for (long i = 0; i < N; i++) {
			number = scan.nextLong();
			count = scan.nextLong();

			for (int j = 0; j < count; j++) {
				array.add(number);
			}
		}
		array.sort(Comparator.naturalOrder());
		System.out.println(array.get(K));
	}
}