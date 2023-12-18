import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long K = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    // 交換レートが３枚以上得でない、もしくは
    // 交換可能枚数にK-2回目に到達できない場合は単純増殖が最適
    if(B<=A+2 || 1+K-2<A) {
      System.out.println(String.format("%d", 1+K));
      return;
    }
    long result = A;
    K = K - (A-1);
    if(K % 2 != 0) {
      result++;
      K--;
    }
    result+=((K/2) * (B-A));
    System.out.println(String.format("%d", result));
  }
}
