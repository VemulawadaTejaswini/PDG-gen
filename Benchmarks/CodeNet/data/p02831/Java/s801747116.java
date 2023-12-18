import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int a = A;
    
    for (int i = 1; i < B; i++) {
      if (a == B) {
        System.out.print(a);
        break;
      }
      a = a *i;
    }
  }
}