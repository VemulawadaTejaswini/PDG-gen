import java.util.Scanner;
import java.io.FileReader;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    int y = in.nextInt();

    if ((x * y)%2 == 1) {
      System.out.print("Odd");
    } else {
      System.out.print("Even");
    }
  }
}