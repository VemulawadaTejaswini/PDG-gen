import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println((double) W / A);
    if (((double) W / A) * B < H) {
      System.out.println("No");
      return;
    }
    String row = "";
    for (int i = 0; i < W; i++)
      if (i < A)
        row += 1;
      else
        row += 0;
    for (int i = 1; i < H; i++) {
      System.out.println(row);
      row = row.substring(A) + row.substring(0, A);
    }
    System.out.println(row);
  }
}