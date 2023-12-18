import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int t = N;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 1; i < N; i++) {
			if(set.contains(t - i)) {
				System.out.println(t);
				break;
			}
			System.out.println(i);
			if(t - i == 0) break;
			t -= i;
			set.add(i);

		}
	}
}