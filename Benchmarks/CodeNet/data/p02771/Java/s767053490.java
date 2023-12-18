import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      if(A==B&&B!=C){
        System.out.println("Yes");
        return;
      }
      if(A==C&&A!=B){
        System.out.println("Yes");
        return;
      }
      if(B==C&&A!=B){
        System.out.println("Yes");
        return;
      }
      System.out.println("No");
      

    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
