import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		
		int result = 0;
		if ("SUN".equals(day)) result = 7;
		if ("MON".equals(day)) result = 6;
		if ("TUE".equals(day)) result = 5;
		if ("WED".equals(day)) result = 4;
		if ("THU".equals(day)) result = 3;
		if ("FRI".equals(day)) result = 2;
		if ("SAT".equals(day)) result = 1;
		
		System.out.println(result);
		
		
	}
}
