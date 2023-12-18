import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = Integer.parseInt(sc.next());

      System.out.println(N % 2 == 0 ? N : N * 2);
    }
  }
}
