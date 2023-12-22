import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long count = 0;
		ArrayList<Long> list = new ArrayList<Long>();

		for(int i = 0;i < n;i++) {
			list.add(scan.nextLong());
		}

		Collections.sort(list, Comparator.reverseOrder());

		if(n == 2) {
			count += Math.min(list.get(0), list.get(1));
		}else {
			for(int i = 1;i < n;i++) {
				if(i < 3) {
					count += list.get(i - 1);
				}else {
					count += list.get(i - 2);
				}

			}
		}


		System.out.println(count);
	}
}
