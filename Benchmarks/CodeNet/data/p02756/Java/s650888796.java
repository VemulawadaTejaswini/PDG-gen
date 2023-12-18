import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.next();
		int N = Integer.parseInt(sc.next());
		boolean switchFlg = false;

		for (int i = 0; i < N; i++) {
			int T =sc.nextInt();
			if (T == 1) {
				if (switchFlg) {
					switchFlg = false;
				}else {
					switchFlg = true;
				}
			}else {
				int F = sc.nextInt();
				if ((F == 1 && switchFlg == false) || (F == 2 && switchFlg == true)) {
					String top = sc.next();
					string = top + string;
				}else if ((F == 1 && switchFlg == true) || (F == 2 && switchFlg == false)) {
					String end = sc.next();
					string = string + end;
				}
			}
		}

		if (switchFlg) {
			System.out.println(new StringBuilder(string).reverse().toString());
		}else {
			System.out.println(string);
		}

	}
}