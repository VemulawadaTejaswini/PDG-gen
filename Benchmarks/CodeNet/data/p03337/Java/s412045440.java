import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = A + B;
    C = Math.max(max, A - B);
    C = Math.max(max, A * B);
    System.out.println(C);
  }
}