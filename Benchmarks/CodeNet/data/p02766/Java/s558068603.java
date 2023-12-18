import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int i = 0;
    
    while (i >= 0) {
      if ((int)Math.pow(K,i) <= N && (int)Math.pow(K,i+1) > N) {
        break;
      }
      i++;
    }
    
    System.out.println(i+1);
  }
}