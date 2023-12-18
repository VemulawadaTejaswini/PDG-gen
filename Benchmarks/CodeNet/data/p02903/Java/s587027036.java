import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i = 0; i < H; i++) {
      for(int j = 0; j < W; j++)
        System.out.print(i < B ^ j < A ? 0 : 1);
      System.out.println();
    }
  }
}