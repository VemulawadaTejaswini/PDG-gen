import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ans = s(n, 0);
		
		System.out.println(ans);

		sc.close();
	}
	
	static int s(int n, int c) {
		if (n < 6)
			return n + c;
		int a = 1;
		while (a * 6 <= n)
			a *= 6;
		
		int b = 1;
		while (b * 9 <= n)
			b *= 9;
		
		return Math.min(s(n - a, c + 1), s(n - b, c + 1));
	}
}
