/**
 * @author yuichirw
 *
 */
import java.util.*;
import java.util.GregorianCalendar;

public class Main {
	static int a,b;
	static Scanner sc = new Scanner(System.in);
	static GregorianCalendar cal = new GregorianCalendar();
	static boolean read() {
		a = sc.nextInt(); b = sc.nextInt();
		return (a == 0 && b == 0) ? false : true; 
	}
	
	static void solve() {
		boolean none = true;
		for(int year = a; year <= b; year++) {
			if(cal.isLeapYear(year)) {
				System.out.println(year);
				none = false;
			}
		}
		if(none) {
			System.out.println("NA");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}
}