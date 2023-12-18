import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      String S = sc.next();
      String b ="";
      int count =0;
      for(int i=0;i<N;i++){
        if(!b.equals(S.substring(i,i+1))){
          count++;
        }
        b = S.substring(i,i+1);
      }

      System.out.println(count);

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