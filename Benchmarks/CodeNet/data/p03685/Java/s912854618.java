import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    int N = sc.nextInt();
    int tate = 0;
    int yoko = 0;
    for(int i = 0; i < N; i++) {
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      if(Math.abs(x1 - x2) == R) tate++;
      if(Math.abs(y1 - y2) == C) yoko++;
    }
    String ans = "YES";
    if(tate > 0 && yoko > 0) ans = "NO";
    System.out.println(ans);
  }
}