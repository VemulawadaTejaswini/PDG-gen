import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    if (((double) W / B) * A < H) {
      System.out.println("No");
      return;
    }
    String row = "";
    for (int i = 0; i < W; i++)
      if (i < B)
        row += 1;
      else
        row += 0;
    for (int i = 1; i < H; i++) {
      System.out.println(row);
      row = row.substring(B) + row.substring(0, B);
    }
    System.out.println(row);
  }
}