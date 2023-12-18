import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    if (A <= 8 && B <= 8) {
      System.out.println("Yay!");
    } else {
      System.out.println(":(");
    }

  }
}