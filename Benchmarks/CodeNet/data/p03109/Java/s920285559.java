import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {
    try (Scanner sc = new Scanner(System.in);) {
      String input = sc.next();

      SimpleDateFormat sdFormat1 = new SimpleDateFormat("yyyy/MM/dd");
      Date date = sdFormat1.parse(input);

      SimpleDateFormat sdFormat2 = new SimpleDateFormat("yyyy/MM/dd");
      Date heiseiDate = sdFormat2.parse("2019/04/30");

      String answer = heiseiDate.compareTo(date) < 0 ? "TBD" : "Heisei";
      System.out.println(answer);
    }
  }
}