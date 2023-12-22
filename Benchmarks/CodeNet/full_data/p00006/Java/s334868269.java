import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    line = new StringBuilder(line).reverse().toString();
    System.out.println(line);
  }
}