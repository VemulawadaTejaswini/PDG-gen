import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b){
			int z = a;
			a = b;
			b = z;
		}
		if(b>c){
			int z = c;
			c = b;
			b = z;
		}
		if(a>b){
			int z = a;
			a = b;
			b = z;
		}
		int ans = 0;
		if(a%2==0||b%2==0||c%2==0){
			ans = 0;
		} else {
			ans = a * b;
		}
		// 出力
		System.out.println(ans);
	}
}