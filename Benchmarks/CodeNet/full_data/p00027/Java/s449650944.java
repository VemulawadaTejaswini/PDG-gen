import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

	static String[] strDay = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Satuday","Sunday"};

	public static void main(String[] args) throws IOException, ParseException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String str = "";
		List<String> input = new ArrayList<String>();

		while((str = br.readLine()) != null){

			String[] strList = str.split(" ");

			if(!strList[0].equals("0")){

				int month = Integer.parseInt(strList[0]);
				int date = Integer.parseInt(strList[1]);

				input.add(getDay(month, date));


			}else{
				break;
			}


		}

		for(String day : input){
			System.out.println(day);
		}

	}

	private static String getDay(int month, int date) throws ParseException{

		Calendar cal = Calendar.getInstance(Locale.JAPAN);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		StringBuilder castMonth = new StringBuilder();
		StringBuilder castDate = new StringBuilder();

		if(month < 10){
			castMonth.append("0");
		}

		castMonth.append(Integer.toString(month));

		if(date < 10){
			castDate.append("0");
		}

		castDate.append(Integer.toString(date));


		Date today = format.parse("2004" + castMonth.toString() + castDate.toString());

		cal.setTime(today);

	    switch (cal.get(Calendar.DAY_OF_WEEK)) {
	        case Calendar.SUNDAY: return "Sunday";
	        case Calendar.MONDAY: return "Monday";
	        case Calendar.TUESDAY: return "Tuesday";
	        case Calendar.WEDNESDAY: return "Wednesday";
	        case Calendar.THURSDAY: return "Thursday";
	        case Calendar.FRIDAY: return "Friday";
	        case Calendar.SATURDAY: return "Saturday";
		    }
		return null;
	}
}