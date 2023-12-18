import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    if (N == 1 && A != B) {
      System.out.println(0);
    } else {
      System.out.println(A+(long)B*(N-1)-(long)A*(N-1)-B+1);
    }
  }
}