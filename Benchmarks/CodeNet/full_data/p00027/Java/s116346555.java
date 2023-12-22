import java.util.*;
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		for (;;) {
			int M = in.nextInt();
			int D = in.nextInt();
			if ((M|D)==0) break;
			Calendar c = Calendar.getInstance();
			c.clear();
			c.set(2004, M-1, D);
			String ans = "";
			switch (c.get(Calendar.DAY_OF_WEEK)) {
				case Calendar.SUNDAY:
					ans = "Sunday";
					break;
				case Calendar.MONDAY:
					ans = "Monday";
					break;
				case Calendar.TUESDAY:
					ans = "Tuesday";
					break;
				case Calendar.WEDNESDAY:
					ans = "Wednesday";
					break;
				case Calendar.THURSDAY:
					ans = "Thursday";
					break;
				case Calendar.FRIDAY:
					ans = "Friday";
					break;
				case Calendar.SATURDAY:
					ans = "Saturday";
					break;
				default:
					ans = "";
					break;
			}
			System.out.println(ans);
		}
	}
}