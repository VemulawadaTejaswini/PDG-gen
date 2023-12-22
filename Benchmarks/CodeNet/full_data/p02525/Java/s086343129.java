import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		double m = sum / n;
		double wa = 0, sa;
		for (int i = 0; i < n; i++) {
			sa = (s[i] - m) * (s[i] - m);
			wa += sa;
		}
		double a = wa / n;
		System.out.println(a);
	}
}