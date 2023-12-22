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
		Long[] a = new Long[n];

		for(int i=0;i<n;i++)a[i] = sc.nextLong();
		
		Long ans = 0l;
		Long max = -1l;

		for(int i=0;i<n;i++){
			if(max < a[i]){
				max = a[i];
			} else {
				ans += max - a[i];
			}
		}

		
		System.out.println(ans);
	}
}