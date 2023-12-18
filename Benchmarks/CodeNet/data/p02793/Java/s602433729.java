import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      int[] ary = new int[a];
      int[] lc = new int[a];
      int max=0;
      for (int i=0;i < a;i++){
        ary[i]=sc.nextInt();
      }
      max=ary[0];
      for (int i=1;i < a;i++){
        max=lcm(max,ary[i]);
      }
      int ans = 0;

      for (int i=0;i < a;i++){
        ans +=(max/ary[i]);
      }
      System.out.println(ans % (1000000000+7));
	}
  private static int lcm(int m, int n){
    return m * n / gcd(m,n);
  }
  private static int gcd(int m,int n){
    if(m<n) return gcd(n,m);
    if(n==0) return m;
    return gcd(n,m%n);
  }
}


