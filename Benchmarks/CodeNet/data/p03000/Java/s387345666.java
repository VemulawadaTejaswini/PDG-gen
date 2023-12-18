import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    
    int D = 0;
    int cnt = 0;
    while (D <= X) {
      int L = sc.nextInt();
      D += L;
      cnt++;
    }
    
    System.out.println(cnt);
  }
}
      