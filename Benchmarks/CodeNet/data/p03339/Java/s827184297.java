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
				char cj = s.charAt(j);
				if(j < i && cj == 'E') continue;
				if(j > i && cj == 'W') continue;
				sum++;
				if(ans <= sum) break;
			}
			if(ans > sum) ans = sum;
		}
		System.out.println(ans);
	}
}
