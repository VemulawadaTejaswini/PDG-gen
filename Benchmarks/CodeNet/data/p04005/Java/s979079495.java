import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		if(a>b){
			long z = a;
			a = b;
			b = z;
		}
		if(b>c){
			long z = c;
			c = b;
			b = z;
		}
		if(a>b){
			long z = a;
			a = b;
			b = z;
		}
		long ans = 0;
		if(a%2==0||b%2==0||c%2==0){
			ans = 0;
		} else {
			ans = a * b;
		}
		// 出力
		System.out.println(ans);
	}
}