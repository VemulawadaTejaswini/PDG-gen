import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      long N = sc.nextLong();
      long A = sc.nextLong();
      long B = sc.nextLong();
      long AB = A+B;
      long AA = (N/AB)*A;
      if((N%AB)>=A){
        AA +=A;
      }else{
        AA +=N%AB;
      }

      System.out.println(AA);


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
