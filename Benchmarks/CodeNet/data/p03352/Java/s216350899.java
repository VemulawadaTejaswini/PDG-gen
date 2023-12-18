import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 0;
		int i = 0;

		while (true) {
			i++;
			if ((int)Math.pow(i, 2) > X) {
				break;
			} else {
				ans = (int)Math.pow(i, 2);
			}
		}
		System.out.println(ans);
	}
}
