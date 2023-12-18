import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int A = scn.nextInt();
    int B = scn.nextInt();

    int sum = A + B;
    int diff = A - B;
    int seki = A * B;

    int max = sum;
    max = Math.max(max, diff);
    max = Math.max(max, seki);

    System.out.println(max);
  }

}
