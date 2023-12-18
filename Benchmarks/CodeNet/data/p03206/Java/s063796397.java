import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();

    String msg = "";
    switch (D) {
      case 22:
        msg = "Christmas Eve Eve Eve";
        break;
      case 23:
        msg = "Christmas Eve Eve";
        break;
      case 24:
        msg = "Christmas Eve";
        break;
      case 25:
        msg = "Christmas";
        break;
    }

    System.out.println(msg);
  }
}
