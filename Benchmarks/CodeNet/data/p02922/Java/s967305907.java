import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    scan.close();
    int res = (B - 1) / (A - 1);
    int mod = (B - 1) % (A - 1);
    System.out.println(mod == 0 ? res : res + 1);
  }
}