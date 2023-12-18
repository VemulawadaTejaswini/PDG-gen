import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double iNum1 = Math.sqrt(sc.nextInt());
    double iNum2 = Math.sqrt(sc.nextInt());
    double iNum3 = Math.sqrt(sc.nextInt());
    String sResult = "";
    if ((iNum1 + iNum2) < iNum3) {
      sResult = "Yes";
    } else {
      sResult = "No";
    }
    System.out.print(sResult);
  }
}
