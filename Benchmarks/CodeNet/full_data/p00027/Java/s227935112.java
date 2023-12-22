
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String data;
		while (true) {
			data = reader.readLine();
			if (data.charAt(0) == '0')
				break;
			StringTokenizer tokenizer = new StringTokenizer(data);
			int month = Integer.parseInt(tokenizer.nextToken())-1;
			int date = Integer.parseInt(tokenizer.nextToken());

			Calendar calendar = Calendar.getInstance();
			calendar.set(2004, month, date);
			int week = calendar.get(Calendar.DAY_OF_WEEK);
			switch (week) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Saturday");
				break;
			}
		}
	}
}