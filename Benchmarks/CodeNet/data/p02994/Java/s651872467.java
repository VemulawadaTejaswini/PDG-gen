import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		List<Integer> scores = new ArrayList<>();
		int delicious = scan.nextInt();
		for (int i = 0; i < NUM; i++) {
			scores.add(delicious + i);
		}

		// search
		int sum = 0;
		Collections.sort(
				scores, 
	            new Comparator<Integer>() {
	                @Override
	                public int compare(Integer a, Integer b) {
	                    return Math.abs(a) - Math.abs(b);
	                }
	            }
	        );
		scores.remove(0);
		for (Integer integer : scores) {
			sum += integer;
		}

		// answer
		System.out.println(sum);

	}
}