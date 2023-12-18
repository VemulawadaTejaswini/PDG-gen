import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] C = new char[H][W];
    for (int i = 0; i < H; i++) {
      C[i] = sc.next().toCharArray();
    }
    for (int i = 0; i < H; i++) {
      System.out.println(C[i]);
      System.out.println(C[i]);
    }
  }
}