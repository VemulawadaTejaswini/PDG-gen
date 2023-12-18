import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nectInt();
    int T = sc.nextInt();
    int max = 0;
    int sum = 0;
    for (int i = 0; i < T; i++) {
      int a = sc.nextInt();
      max = Math.max(max, a);
      sum += a;
    }
    int others = sum - max;
    
    System.out.println(Math.max(max-1-others, 0));
  }
}