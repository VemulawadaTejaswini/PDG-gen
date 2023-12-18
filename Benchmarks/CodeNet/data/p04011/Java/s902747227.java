import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N, K, X, Y;
    
    N = scan.nextInt();
    K = scan.nextInt();
    X = scan.nextInt();
    Y = scan.nextInt();
  
    int sa = N - K;
    int ans = K * X + sa * Y;
    
    System.out.println(ans);
    
  }

}