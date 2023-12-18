import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long W = sc.nextLong();
    long H = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();

    int flag = 2*x == W && 2*y == H ? 1 : 0;

    System.out.println((double)W*H/2 + " " + flag);
  }
}
