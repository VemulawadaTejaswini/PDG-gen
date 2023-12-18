import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int W = s.nextInt();
    int H = s.nextInt();
    int x = s.nextInt();
    int y = s.nextInt();
    int ans = 0;

    System.out.printf("%.6f ",(double)W*H/2);
    if((double)x == (double)W / 2 && (double)y == (double)H / 2)
      System.out.println(1);
    else
      System.out.println(0);
  }
}
