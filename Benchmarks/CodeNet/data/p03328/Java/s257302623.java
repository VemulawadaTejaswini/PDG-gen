import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int d = b - a;
    int s = 0;
    for(int i = 1; i < d; i++) {
      s += i;
    }
    System.out.println(s - a);
  }
}