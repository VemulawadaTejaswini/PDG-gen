import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hp = sc.nextInt();
    int at = sc.nextInt();

    int i = 0;
    while (hp > 0) {
      hp = hp - at;
      i++;
    }

    System.out.println(i);
  }
}
