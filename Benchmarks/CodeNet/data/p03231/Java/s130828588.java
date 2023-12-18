import java.util.Scanner;

public class Main {

	int n, m;
	String s, t;

	public static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int min(int a,int b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String nm = sc.nextLine();
		String[] len = nm.split(" ");

		int n = Integer.parseInt(len[0]);
		int m = Integer.parseInt(len[1]);

		String s = sc.nextLine();
		String t = sc.nextLine();

		for (int i = 0; i < min(m,n); i++) {
			if ((((m * i) % n == 0) && ((m * i) / n < m) && (s.charAt(i) != t.charAt((m * i) / n))) ||
				(((n * i) % m == 0) && ((n * i) / m < n) &&(t.charAt(i) != s.charAt((n * i) / m)))) {
				System.out.println("-1");
				return;
			}
		}

		System.out.println(lcm(n, m));
		return;
	}

}