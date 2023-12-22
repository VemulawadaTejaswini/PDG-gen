import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    String sep = System.getProperty("line.separator");
    System.out.println((x ^ 3) + sep);
  }
}