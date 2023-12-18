import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int k = num.nextInt();
		int h = n - 2;
		int ans = 0;
		int chk = 0;
		int check = 0;
		
		for (int i = 2; i <= 6; i++) {
			chk = (i * 3 + 21) * 3;
			for (int x = 1; x <= h; x++) {
				check = chk % 11;
				if (check == k) {
					ans = ans + 1;
				}
				chk = chk + 63;
			}
		}
		System.out.println(ans);
		num.close();
	}
}
