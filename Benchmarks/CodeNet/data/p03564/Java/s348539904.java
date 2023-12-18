import java.util.*;
    
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int F = 1;
    for(int i = 0; i < N; i++){
      F = Math.min(F+K, F*2);
    }
    System.out.println(F);
  }
}
