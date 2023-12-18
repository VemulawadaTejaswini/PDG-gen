import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    int a = y / 10000;
    int b = (y % 10000) / 5000;
    int c = ((y % 10000) % 5000) / 1000;
    if(a + b + c <= n) {
      System.out.println(a + " " + b + " " + c);
    } else {
      System.out.println(-1 + " " + -1 + " " + -1);
    }
  }
}
