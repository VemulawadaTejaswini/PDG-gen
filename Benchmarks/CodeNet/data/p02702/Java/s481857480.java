import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String strNumber = sc.next();
    int count = 0;
    for (int i = 0; i <= strNumber.length(); i++) {
      for (int j = i + 4; j <= strNumber.length(); j++) {
        long number = Long.parseLong(strNumber.substring(i, j));
        if (number % 2019 == 0) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

}
