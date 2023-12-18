import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int D = sc.nextInt();
    int N = sc.nextInt();
    
    int a = 1;
    
    for (int i = 0; i < D; i++) {
      a *= 100;
    }
    
    System.out.println(N == 100 ? a * (N + 1) : a * N);
  }
}