import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		int N ;
		int number;
		int count;
		int K;

		N = Integer.parseInt(scan.next());
		K = Integer.parseInt(scan.next());
		
		for (int i = 0; i < N; i++) {
			number = Integer.parseInt(scan.next());
			count = Integer.parseInt(scan.next());
			
			for (int j = 0; j < count; j++) {
				array.add(number);
			}
		}
		array.sort(Comparator.naturalOrder());
		System.out.println(array.get(K - 1));
	}
}