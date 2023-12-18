
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan	= new Scanner(System.in);
		String	s		= scan.next();
		int cnt			= 0;
		if (s.equals("SUN")) {
			cnt = 7;
		} else if (s.equals("MON")) {
			cnt = 6;
		} else if(s.equals("TUE")) {
			cnt = 5;
		} else if(s.equals("WED")) {
			cnt = 4;
		} else if(s.equals("THU")) {
			cnt = 3;
		} else if(s.equals("FRI")) {
			cnt = 2;
		} else {
			cnt = 1;
		}
		System.out.println(cnt);
	}
}
