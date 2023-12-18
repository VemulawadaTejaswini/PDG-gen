import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt(), Y = scn.nextInt();
		int ans = 0;
		if (X == 1 && Y == 1) {
			ans = 1000000;
		} else {
			switch (X) {
			case 1:
				ans += 300000;
				break;
			case 2:
				ans += 200000;
				break;
			case 3:
				ans += 100000;
				break;
			default:
				break;
			}
			switch (Y) {
			case 1:
				ans += 300000;
				break;
			case 2:
				ans += 200000;
				break;
			case 3:
				ans += 100000;
				break;
			default:
				break;
			}
		}

		System.out.println(ans);
	}

}
