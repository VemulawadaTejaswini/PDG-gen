import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month, day, daycnt;
		int[] days = {31,29,31,30,31,30,31,31,30,31,30};
		String[] weekday = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
		
		for(;;){
			month = sc.nextInt();
			day = sc.nextInt();
			if(month == 0 && day == 0) break;

			daycnt = 0;
			for(int i = 0; i < month - 1; i++){
				daycnt += days[i];
			}

			System.out.println(weekday[(daycnt + day + 3) % 7] + "day");
		}
	}
}