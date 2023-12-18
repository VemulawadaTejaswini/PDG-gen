import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ans = 1;
		int N = scan.nextInt();
		for(int i = 1; i <= N; i++) {
			ans = i * ans % (10^9 + 7);
		}
		scan.close();
		System.out.println(ans);
	}
}
