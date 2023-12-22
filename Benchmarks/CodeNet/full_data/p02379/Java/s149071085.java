import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    double c = Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    System.out.println(c);
  }
}

