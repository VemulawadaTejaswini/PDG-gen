
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

  public void run() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    while ((in = reader.readLine()) != null) {
      String[] splited = in.split(" ");
      int month = Integer.parseInt(splited[0]);
      int date = Integer.parseInt(splited[1]);

      //month???0????????????
      if (month == 0)
        break;

      Calendar cal = new GregorianCalendar(2004, month - 1, date);
      switch (cal.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY:
          System.out.println("Sunday");
          break;
        case Calendar.MONDAY:
          System.out.println("Monday");
          break;
        case Calendar.TUESDAY:
          System.out.println("Tuesday");
          break;
        case Calendar.WEDNESDAY:
          System.out.println("Wednesday");
          break;
        case Calendar.THURSDAY:
          System.out.println("Thursday");
          break;
        case Calendar.FRIDAY:
          System.out.println("Friday");
          break;
        case Calendar.SATURDAY:
          System.out.println("Saturday");
          break;
      }
    }
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    main.run();
  }

}