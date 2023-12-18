import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner cin = new Scanner(System.in);

    String[] s = cin.nextLine().split(" ");
    int row = Integer.parseInt(s[0]);
    int col = Integer.parseInt(s[1]);
    int num = Integer.parseInt(s[2]);

    if (num % col == 0 && num <= row * col) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
