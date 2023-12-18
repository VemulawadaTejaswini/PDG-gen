import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		Set set = new HashSet<Integer>();

		set.add(A);
		set.add(B);
		set.add(C);


		if (set.size() == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}