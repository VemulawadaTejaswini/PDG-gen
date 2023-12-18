import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] D = new int[10];
    for (int i = 0; i < K; i++) {
      D[sc.nextInt()] = 1;
    }
    
    int i = N;
    while(!isValid(i, D)) {
      i++;
    }
    System.out.println(i);
  }
  
  private static boolean isValid(int n, int[] D) {
    while (n != 0) {
      int a = n%10;
      n /= 10;
      if (D[a] == 1) {
        return false;
      }
    }
    return true;
  }
    
}