import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int oddNum = ( K + 1 ) / 2;
    int evenNum = K / 2;

    System.out.println(oddNum * evenNum);
  }
}
