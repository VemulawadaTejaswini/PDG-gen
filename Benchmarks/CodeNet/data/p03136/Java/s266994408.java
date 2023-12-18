import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      int l = sc.nextInt();
      sum += l;
      if (max < l) {
        max = l;
      }
    }
    
    if (max < sum - max) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}