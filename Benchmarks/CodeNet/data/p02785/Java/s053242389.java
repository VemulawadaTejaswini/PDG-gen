import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		long sum = 0;
		ArrayList<Long> list = new ArrayList<Long>(n);

		for(int i = 0;i < n;i++) {
			list.add(scan.nextLong());
		}

		Collections.sort(list , Collections.reverseOrder());

		if(k >= n) {
			System.out.println(0);
		}else {
			for(int i = 0;i < n;i++) {
				if(k == 0) {
					sum += list.get(i);
				}else {
					k -= 1;
				}
			}

			System.out.println(sum);
		}
	}
}
