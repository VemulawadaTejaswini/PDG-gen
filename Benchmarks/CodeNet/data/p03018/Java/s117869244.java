import java.util.Scanner;

//AtCoder Grand Contest 034
//B	ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int ans = 0;

		String[] sp = S.split("BC");

		int preAcount = 0;

		for (int i = 0; i < sp.length; i++) {
			String s = sp[i];
			if (s.length() == 0) {
				ans += preAcount;
			} else {
				boolean allA = true;
				int Acount = 0;
				for (int j = s.length() - 1; j >= 0; j--) {
					if (s.charAt(j) == 'A') {
						Acount++;
					} else {
						allA = false;
						break;
					}
				}
				if (allA) {
					Acount += preAcount;
				}
				ans += Acount;
				preAcount = Acount;
			}
		}

		System.out.println(ans);
	}
}
