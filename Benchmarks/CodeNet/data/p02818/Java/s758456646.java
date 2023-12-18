import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    for (long i = 0; i < K; i++) {
      if (A != 0) {
        A--;
      } else {
        B--;
      }
    }
    System.out.print(A + " " + B);
  }
}