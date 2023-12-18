import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int a = A;
    int b = B;
    
    for (int i = 1; i < B; i++) {
      if (A * i % B == 0) {
        System.out.print(A * i);
      }
    }
  }
}