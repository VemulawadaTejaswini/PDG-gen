import java.util.Scanner;

public class Main {

  static String compare(int a, int b) {
    String operator = "";
    if (a < b) {
      operator = " < ";
    } else if (a > b) {
      operator = " > ";
    } else {
      operator = " == ";
    }
    return operator;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    System.out.println(a+compare(a,b)+b);
  }
}