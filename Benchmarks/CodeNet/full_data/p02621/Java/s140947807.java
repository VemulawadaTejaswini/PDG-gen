import java.util.Scanner;

class Calc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System. in);
    String input = scanner. nextLine();
    int num = Integer.parseInt(input);
    int output = num + num*num + num*num*num;
    System.out.println(output);
    scanner.close();
  }
}