import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> as = new ArrayList<>();
		for (int i=0; i<n; i++) {
			as.add(scanner.nextInt());
		}
		Collections.sort(as);

		int max = as.get(n-1);
		int cand = -1;
		int candabs = max*2;
		for (int a:as) {
			int abs = Math.abs(a*2-max);
			if (abs<candabs && a!=max) {
				cand = a;
				candabs = abs;
			}
		}
		System.out.println(max + " " + cand);
	}

}