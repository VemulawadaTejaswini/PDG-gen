
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		List<Long> b = new ArrayList<Long>();
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
			if(i % 2 != n % 2) {
				b.add(0, a[i]);
			} else {
				b.add(a[i]);
			}
		}
		for(int i = 0; i < b.size(); i++) {
			System.out.print(b.get(i));
			if(i < b.size() - 1) {
				System.out.print(" ");
			}
		}
		scan.close();
	}

}
