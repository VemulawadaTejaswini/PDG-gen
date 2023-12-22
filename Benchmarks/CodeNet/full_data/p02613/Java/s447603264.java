import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int ac_cnt = 0;
		int wa_cnt = 0;
		int tle_cnt = 0;
		int re_cnt = 0;

		for (int i = 0; i < a; i++) {
			String b = sc.next();
			if (b.contentEquals("AC")) {
				ac_cnt++;
			} else if (b.contentEquals("WA")) {
				wa_cnt++;
			} else if (b.contentEquals("TLE")) {
				tle_cnt++;
			} else if (b.contentEquals("RE")) {
				re_cnt++;
			}
		}

		System.out.println("AC x " + ac_cnt);
		System.out.println("WA x " + wa_cnt);
		System.out.println("TLE x " + tle_cnt);
		System.out.println("RE x " + re_cnt);
	}
}
