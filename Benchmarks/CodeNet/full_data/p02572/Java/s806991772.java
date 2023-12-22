import java.util.*;
class Main {
 
	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}
   //整数かどうかを判定する
 static boolean isInteger(double number){return Math.ceil(number) == Math.floor(number); }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		Long a[] = new Long[n];
		Long cSum[] = new Long[n+1];

		
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
		}
		cSum[0] = 0l;
		for (int i = 1; i <= n; i++) {
            // 累積和計算
            cSum[i] = cSum[i - 1] + a[i - 1];
		}
		
		Long ans = 0l;

		for(int i=0;i<n+1;i++){
			if(i == n){
				break;
			}
			ans += cSum[i] * a[i];
          	ans %= 1000000007;
		}

		System.out.println(ans);
	}
}
