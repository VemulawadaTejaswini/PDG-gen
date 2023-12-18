import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String A = sc.next();
      if("SAT".equals(A)){
      System.out.println("1");
      }else if("FRI".equals(A)){
      System.out.println("2");
      }else if("THU".equals(A)){
      System.out.println("3");
      }else if("WED".equals(A)){
      System.out.println("4");
      }else if("TUE".equals(A)){
      System.out.println("5");
      }else if("MON".equals(A)){
      System.out.println("6");
      }else if("SUN".equals(A)){
      System.out.println("7");
      }
        
      

 
      
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