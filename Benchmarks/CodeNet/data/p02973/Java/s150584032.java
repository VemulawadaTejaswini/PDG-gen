import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final List<Integer> a = new ArrayList<>();
			
		for (int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}
		
		int count = 0;
		while (true) {
			if (check(a.size(), a)) {
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}

	private static boolean check(int N, List<Integer> a) {
		if (N == 0) {
			return true;
		}
		
		int current = -1;
		for (int i = N - 1; i >= 0; i--) {
			if (current < 0) {
				current = a.get(i);
				a.remove(i);
				continue;
			}
			
			if (a.get(i) < current) {
				current = a.get(i);
				a.remove(i);
				continue;
			}
		}
		
		return false;
	}
	
}