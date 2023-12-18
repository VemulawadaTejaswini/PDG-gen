import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    if (X%Y == 0) {
      System.out.println(-1);
    } else {
      System.out.println((long)X*(Y+1));
    }
  }
}