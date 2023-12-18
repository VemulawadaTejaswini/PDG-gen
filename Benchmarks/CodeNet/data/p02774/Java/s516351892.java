import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      int K = sc.nextInt();
      ArrayList<Long> mA = new ArrayList<>(); 
      int zc = 0;
      ArrayList<Long> pA = new ArrayList<>(); 
      long lg;
      for(int i=0;i<N;i++){
        lg = sc.nextLong();
        for(Long p:pA){
          mA.add(lg*p);
        }
        pA.add(lg);
      }
      Collections.sort(mA);
      System.out.println(mA.get(K-1));


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
