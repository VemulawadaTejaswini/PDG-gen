import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 0;

    while (sc.hasNext()) {
      i *= Integer.parseInt(sc.next());
    }

    if (i % 2 == 1) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }

    sc.close();

  }
}