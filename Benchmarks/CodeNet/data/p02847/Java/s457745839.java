import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		int remain = 0;

		if (day.equals("MON")) {
			remain = 1;
		}
		else if (day.equals("TUE")) {
			remain = 2;
		}
		else if (day.equals("WED")) {
			remain = 3;
		}
		else if (day.equals("THU")) {
			remain = 4;
		}
		else if (day.equals("FRI")) {
			remain = 5;
		}
		else if (day.equals("SAT")) {
			remain = 6;
		}
		else if (day.equals("SUN")) {
			remain = 7;
		}
		System.out.println(remain);
	}

}
