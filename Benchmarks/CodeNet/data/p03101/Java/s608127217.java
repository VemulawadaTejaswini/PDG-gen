import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();
    int kuro = W * h + H * w - h * w;
    int ans = H * W - kuro;
    System.out.println(ans);
  }
}