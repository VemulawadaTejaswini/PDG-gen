import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = 0;
    sc.close();
    if (B % A != 0) {
      C = B % A + 1;
    } else {
      C = B / A;
    }
    System.out.println(C);
  }
}
