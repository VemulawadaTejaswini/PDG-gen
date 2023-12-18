import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    boolean flag = false;

    for (int i = 1; i <= 3; i++){
      if (A * B * i % 2 == 1) flag = true;
    }
    System.out.println(flag ? "Yes" : "No");
  }
}
