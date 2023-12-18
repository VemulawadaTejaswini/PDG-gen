import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        GregorianCalendar date =
            new GregorianCalendar(Integer.parseInt(s.substring(0, 4)), Integer.parseInt(s.substring(5, 7)), Integer.parseInt(s.substring(8, 10)));
        GregorianCalendar date2 = new GregorianCalendar(2019, 4, 30);

        if (0 <= date2.compareTo(date)) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }

    }

}
