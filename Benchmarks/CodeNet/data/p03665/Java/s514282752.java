import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    
    long ans = (long)Math.pow(2, N - 1);
    if(P == 1) ans = (long)Math.pow(2, N) - ans;
    System.out.println(ans);
  }
}