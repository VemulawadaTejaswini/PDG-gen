import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long W = sc.nextLong();
    long H = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();

    if (2*x == W && 2*y == H) {
      System.out.println((double)W*H/2 + " 1");
      return;
    }
    if (W*y == H*x || W*y + H*x == H*W) {
      System.out.println((double)W*H/2 + " 0");
      return;
    }

    long xH = x <= W/2 ? x * H : (W-x) * H;
    long yW = y <= H/2 ? y * W : (H-y) * W;
    int flag = xH == yW ? 1 : 0;

    System.out.println((double)(Math.max(xH, yW)) + " " + flag);
  }
}
