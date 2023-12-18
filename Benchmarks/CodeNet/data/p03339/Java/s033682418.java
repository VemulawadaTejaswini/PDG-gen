import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();

		int ans = s.length();

		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				if(j < i && s.charAt(j) == 'E') continue;
				if(j > i && s.charAt(j) == 'W') continue;
				sum++;
			}
			ans = c(ans, sum);
		}

		System.out.println(ans);
	}

	static int c(int a, int b) {
		if(a < b) return a;
		return b;
	}
}
