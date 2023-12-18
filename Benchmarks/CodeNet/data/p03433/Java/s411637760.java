import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int N = sc.nextInt();
		if ((N - A) % 500 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
