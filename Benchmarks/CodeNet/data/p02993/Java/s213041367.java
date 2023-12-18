import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pin = sc.nextInt();
    char[] pinstr = null;
    try {
      pinstr = Integer.toString(pin).toCharArray();
    } catch (Exception ignored) {}
    if (pinstr[0] == pinstr[1]) {
      System.out.println("Bad");
      return;
    }
    if (pinstr[1] == pinstr[2]) {
      System.out.println("Bad");
      return;
    }
    if (pinstr[2] == pinstr[3]) {
      System.out.println("Bad");
      return;
    }
    System.out.println("Good");
  }

}