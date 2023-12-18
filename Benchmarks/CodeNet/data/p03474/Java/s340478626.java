import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String N = sc.next();

    if(N.length() == A+B+1 && N.substring(A, A+1).equals("-")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}