import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    if (sc.next().equals("H")) {
      if (sc.next().equals("H")) {
        System.out.println("H");
      } else {
        System.out.println("D");
      }
    } else {
      if (sc.next().equals("D")) {
        System.out.println("H");
      } else {
        System.out.println("D");
      }
    }

  }
}