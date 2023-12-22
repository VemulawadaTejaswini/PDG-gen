import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		ArrayList<Integer> ansList = new ArrayList<>();

		
		int ans = 0;
		for (int i=2; i<=n; i++) {
			if (n % i == 0 && !ansList.contains(i)) {
				n /= i;
				ansList.add(i);
				ans++;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}