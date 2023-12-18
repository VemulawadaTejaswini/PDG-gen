import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ans = 1;
		int a = 10;
		for(int k = 0; k < 9; k++) {
			a = a * 10;
		}
		a = a + 7;
		int N = scan.nextInt();
		for(int i = 1; i <= N; i++) {
			ans = ans * i;
		}
		ans = ans % a;
		scan.close();
		System.out.println(ans);
	}
}
