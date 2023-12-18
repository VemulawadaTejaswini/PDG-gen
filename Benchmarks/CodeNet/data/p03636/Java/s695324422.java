import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    int length = input.length();
    System.out.println(input.charAt(0) + String.valueOf(length - 2) + input.charAt(length - 1));
  }
}
