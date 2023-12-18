import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] S = scanner.nextLine().split(" ");
    scanner.close();
    int A = Integer.valueOf(S[0]);
    int B = Integer.valueOf(S[1]);

    int minA = ceil(25 * A / 2);
    int maxA = ceil(25 * (A + 1) / 2) - 1;
    int minB = ceil(10 * B);
    int maxB = ceil(10 * (B + 1)) - 1;
    if(minA > maxB || minB > maxA) {
        System.out.println(-1);
    } else {
        int a = minA > minB ? minA : minB;
        System.out.println(a);
    }
  }

  public static int ceil(int a) {
      return (int) Math.ceil(a);
  }
}