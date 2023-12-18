import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
	int N = sc.nextInt();
    int[] H = new int[N];
    H[0] = sc.nextInt();
      int max = 0;
      int next = 0;
    for(int i=1;i<N;i++){
      H[i]=sc.nextInt();
      if(H[i]<=H[i-1]){
        next++;
      }else{
       if(max<next){
         max=next;
       }
        next=0;
      }
      if(i+1==N&&max<next){
        max=next;
      }
    }

      System.out.println(max);

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