import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      int X = 1;
	  for(X=1;X<50000;X++){
        if((X*108)/100==N){
          System.out.println(X);
          return;
        }
      }
      System.out.println(":(");
      

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
