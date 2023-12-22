import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.close();
		String ans = switch(N) {
		case	3 -> "bon";
		case	0,1,6,8 -> "pon";
		default	-> "hon";
		};
		System.out.println(ans);
	}
}