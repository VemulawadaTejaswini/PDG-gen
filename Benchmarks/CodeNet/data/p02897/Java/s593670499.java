import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = 0;
		if (n % 2 == 0) {
			a = 0.5;
		} else {
			a = 0.6;
		}
		if (n == 1) {
			a = 1;
		}
		System.out.println(a);
	}
}