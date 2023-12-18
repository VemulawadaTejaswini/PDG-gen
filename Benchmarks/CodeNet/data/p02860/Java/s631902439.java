import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String S = sc.next();
    
    if (N % 2 == 0) {
	  if (S.substring(0, N / 2).equals(S.substring(N / 2, N))) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}