import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long sa = c-a-b;
      
      if(sa<=0){
        System.out.println("No");
        return;
      }
      if(4*a*b<sa*sa){
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
