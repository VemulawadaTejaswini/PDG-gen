import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int D = scn.nextInt();
		String ans;
		switch (D) {
		case 25:
			ans = "Christmas";
			break;
		case 24:
			ans = "Christmas Eve";
			break;
		case 23:
			ans = "Christmas Eve Eve";
			break;
		case 22:
			ans = "Christmas Eve Eve Eve";
			break;
		default:
			ans = "";
			break;
		}
		System.out.println(ans);

	}
}
