import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Long> a = new ArrayList<Long>(n);
		for ( int i = 0; i < n; i++ ) {
			a.add(in.nextLong());
		}

		int idx = 0;
		
		long cost = 0;

		while ( a.size() > 1 ) {
			long sum = Long.MAX_VALUE;

			for ( int i = 0; i <= a.size() - 2; i++ ) {
				long temp = 0;
				temp = a.get(i) + a.get(i + 1);

				if ( sum > temp ) {
					sum = temp;
					idx = i;
				}
			}
			
			cost += sum;
			a.remove(idx);
			a.remove(idx);
			a.add(idx, sum);
		}
		System.out.println(cost);
		in.close();
	}
}