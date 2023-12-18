import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int T = sc.nextInt();
    int cost = 2000;
    for(int i = 0; i < n; i++) {
      int c = sc.nextInt();
      int t = sc.nextInt();
      if(t <= T) cost = Math.min(cost, c); 
    }
    System.out.println(cost);
  }
}