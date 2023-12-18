import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
	int A = sc.nextInt();
    int B = sc.nextInt();
      int count =1;
      int i=0;
for(i=0;count<B;){
  i++;
  count=count+(A-1);
}
      System.out.println(i);

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