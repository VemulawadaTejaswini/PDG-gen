
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			List<Long> list = new ArrayList<>(n * (n - 1) / 2);
			for(int i = 0 ; i < n - 1 ; i++) {
				for(int j = i + 1 ; j < n ; j++) {
					long b = a[i];
					list.add(b * a[j]);
				}
			}
			Collections.sort(list);
			System.out.println(list.get(k - 1));
		}

	}

}
