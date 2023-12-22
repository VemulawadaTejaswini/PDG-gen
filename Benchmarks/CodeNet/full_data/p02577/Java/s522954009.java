import java.util.*;
class Main {
 
	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}
   //整数かどうかを判定する
 static boolean isInteger(double number){return Math.ceil(number) == Math.floor(number); }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String s = sc.next();
		char[] c = s.toCharArray();

		Long ans = 0l;
		for(int i=0;i<s.length();i++){
			ans += s.charAt(i) - '0';
		}
		
		if(ans%9 == 0){
			System.out.println("Yes");
		} else System.out.println("No");
	}
}