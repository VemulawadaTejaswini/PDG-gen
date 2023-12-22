import java.io.*;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            while((line = br.readLine()) != null) {
            		String[] list = line.split(" ", 0);
            		int month = Integer.parseInt(list[0]);
            		int day = Integer.parseInt(list[1]);
            		if(month == 0 && day == 0) {
            			break;
            		}
            		String date = tellMeDate(month, day);
            		System.out.println(date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   private static String tellMeDate(int month, int day) {
	   
	   Calendar cal = Calendar.getInstance();
	   int year = 2004;
	   cal.set(year, month - 1, day);
	   switch (cal.get(Calendar.DAY_OF_WEEK)) { 
	    case Calendar.SUNDAY:
	    		String date = "Sunday";
	    		return date; 
	    case Calendar.MONDAY:  
	        //????????\
	    	String date1 = "Monday";
	    		return date1;
	    case Calendar.TUESDAY: 
	        //????????\
	    	String date2 = "Tuesday";
	        return date2;
	    case Calendar.WEDNESDAY: 
	        //?°´?????\
	    	String date3 = "Wednesday";
	        return date3;
	    case Calendar.THURSDAY:
	        //??¨?????\
	    	String date4 = "Thursday";
	        return date4;
	    case Calendar.FRIDAY:
	        //????????\
	    	String date5 = "Friday";
	        return date5;
	    case Calendar.SATURDAY:
	        //????????\
	    	String date6 = "Saturday";
	        return date6;
	}
	   return null;
   }
}