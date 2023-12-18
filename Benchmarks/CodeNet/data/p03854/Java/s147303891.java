import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer(sc.next()).reverse();
		String S = sb.toString();

		String[] divide = {"dream", "dreamer", "erase", "eraser"};

		for(int i = 0; i < 4; i++) {
			StringBuffer sbd = new StringBuffer(divide[i]).reverse();
			divide[i] = sbd.toString();
		}
		for(int i = 0; i < 4; i++) {
			S = S.replace(divide[i], "");
		}


		if(S.equals("")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
