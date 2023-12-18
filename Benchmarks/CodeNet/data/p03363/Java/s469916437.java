import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);


		int n = Integer.parseInt(sc.next());

		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		ArrayList<Long> s = new ArrayList<Long>();
		s.add((long) 0);
		for(int i = 0; i < n; i++) {
			s.add(s.get(i) + a[i]);
		}
		Collections.sort(s);

		int count = 0;
		for(int i = 0; i < n + 1; i++) {
			long base = s.get(i);
			for(int j = i + 1; j < n + 1; j++) {
				if(s.get(j) == base) {
					count++;
				}else {
					break;
				}
			}
		}
		System.out.println(count);

	}
}