import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int cnt = 0;
		int n = 3;
		for (int i = 0; i < n; i++) {
			if (!set.add(sc.nextInt()))
				continue;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
