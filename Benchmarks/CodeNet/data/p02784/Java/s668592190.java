import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hp = sc.nextInt();
    int skills = sc.nextInt();

    int total = 0;
    for (int i = 0; i < skills; i++) {
      total += sc.nextInt();
    }

    if (total >= hp) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
