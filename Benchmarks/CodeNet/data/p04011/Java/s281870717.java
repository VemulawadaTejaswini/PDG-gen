import java.util.*;

public class Main{
  public static void main (String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int ans;
    
    if(N <= K){
      ans = N * X;
    }else{
      ans = K * X + (N - K) * Y;
    }
    
    System.out.println(ans);
    
  }
}