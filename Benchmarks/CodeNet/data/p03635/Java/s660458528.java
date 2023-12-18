import java.util.Scanner;

class atcorder69_1 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String input1 = scanner.next();
    String input2 = scanner.next();
    int a = Integer.parseInt(input1);
    int b = Integer.parseInt(input2);
    int c = (a-1) * (b-1);

    System.out.println(c);
    scanner.close();
  }
}