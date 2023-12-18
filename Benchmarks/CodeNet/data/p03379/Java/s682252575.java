import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> x_sort = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			int xi = Integer.parseInt(sc.next());
			x.add(xi);
			x_sort.add(xi);
		}
		Collections.sort(x_sort);

		int median_minor = x_sort.get((n / 2) - 1);
		int median_major = x_sort.get(n / 2);

		for(int i = 0; i < n; i++) {
			if(x.get(i) <= median_minor) {
				System.out.println(median_major);
			}else {
				System.out.println(median_minor);
			}
		}

	}

}
