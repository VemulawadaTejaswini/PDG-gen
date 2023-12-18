import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long r = sc.nextInt();
    long w = sc.nextInt();
    long rok1 = (r + 1) / 2;
    long rok2 = r / 2;
    long ok = ((w + 1) / 2) * rok1 + (w / 2) * rok2;
    System.out.printf("%d", ok);
  }
}