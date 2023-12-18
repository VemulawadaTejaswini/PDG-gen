import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long k = scan.nextLong();
		List<Long> list = new ArrayList<Long>();
		
		for (int i=0; i<n; i++) {
			long input = scan.nextLong();
			list.add(input);
		}
		
		long max = 0;
		for (long i=0; i<=k; i++) {
			long sum = 0;
			for (long item : list) {
				sum += i ^ item;
			}
			if (sum > max) max = sum;
		}
		
		System.out.println(max);
	}
}