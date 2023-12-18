import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		if(R - L >= 2019) {
			System.out.println(0);
		} else {
			int ans = Integer.MAX_VALUE;
			for(int i = L; i <= R; i++) {
				for(int j = L; j <= R; j++) {
					if(i == j) continue;
					ans = Math.min(ans, i * j % 2019);
				}
			}
			System.out.println(ans);
		}
	}
}
