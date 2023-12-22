import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.close();
		String ans = switch(N) {
			case 2,4,5,7,9 -> "hon";
			case 0,1,6,8   -> "pon";
			default        -> "bon";
		};
		System.out.print(ans);
	}

}
