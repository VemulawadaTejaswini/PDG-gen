import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			int ans = 0;
			if("SUN".equals(s)) {
				ans = 7;
			}
			if("MON".equals(s)) {
				ans = 6;
			}
			if("TUE".equals(s)) {
				ans = 5;
			}
			if("WED".equals(s)) {
				ans = 4;
			}
			if("THU".equals(s)) {
				ans = 3;
			}
			if("FRI".equals(s)) {
				ans = 2;
			}
			if("SAT".equals(s)) {
				ans = 1;
			}

			System.out.println(ans);

		}

	}

}
