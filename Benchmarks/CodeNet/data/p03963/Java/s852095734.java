import java.util.Scanner;
import java.lang.String;
 
public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    sc.close();
    long result = K;
    for (int i = 1; i < N; i++) {
      result *= (K - 1);
    }
    System.out.println(result);
  }
}