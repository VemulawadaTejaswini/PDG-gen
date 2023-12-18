import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int t = 1;
    while (true) {
      if (X <= t * (t + 1) / 2) {
        System.out.println(t);
        return;
      }
      t++;
    } 
  }
}