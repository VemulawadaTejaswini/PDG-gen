import java.util.Calendar;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			Calendar cal = Calendar.getInstance();
			String str = sc.nextLine();
			String date[] = str.split(" ");
			int month = Integer.parseInt(date[0]);
			int day = Integer.parseInt(date[1]);
			if(month == 0) break;

			cal.set(2004, month, day);
			dispCal(cal);
		}
	}

	private static void dispCal(Calendar cal){
		String[] weekName = {"Thursday","Friday","Saturday",
				"Sunday","Monday","Tuesday","Wednesday"};

		int week = cal.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println(weekName[week]);
	}
}