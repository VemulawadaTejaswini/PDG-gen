import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //入力
    int N = sc.nextInt();
    int K = sc.nextInt();
    int X = sc.nextInt();    
    int Y = sc.nextInt(); 
    //出力
    if (N > K) {
      System.out.println(K*X + (N-K)*Y);
    } else {
      System.out.println(N*X);
    }
  }
}