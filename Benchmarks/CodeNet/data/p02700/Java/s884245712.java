import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int win =0, lose =0;
    while (true) {
      C -= B;
      if (C <= 0) {
        win++;
        break;
      }
      A -= D;
      if (A <= 0) {
        break;
      }
    }
    if (win != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}