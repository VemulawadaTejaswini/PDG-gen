import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    if ((A-B) % 2 != 0) {
      System.out.println("IMPOSSIBLE");
      return;
    }
    if (A > B) {
      System.out.println(B + (A-B)/2);
    } else {
      System.out.println(A + (B-A)/2);
    }
  }
}