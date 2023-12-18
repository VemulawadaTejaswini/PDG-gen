import java.util.*;

public class Main {
  
  public static void main(String[] arg) {
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int X = sc.nextInt();
    if(X < A) {
      System.out.println(0);
    } else {
      System.out.println(10);
    }
  }
}