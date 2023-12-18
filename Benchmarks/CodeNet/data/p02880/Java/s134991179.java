import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean b = false;
		for (int i = 1; i <= 9 && !(b = n % i == 0 && n / i <= 9); i++) ;
		System.out.println(b ? "Yes" : "No");
	}
}
