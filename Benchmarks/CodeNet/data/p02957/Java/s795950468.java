	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a,b;
			int result,k0;
			a = sc.nextInt();
			b = sc.nextInt();
			result=0;
			if ((a+b)%2==0) {
				k0=(a+b)/2;
				System.out.print(k0);
				}
			else
				System.out.print("IMPOSSIBLE");

			
 
			// 出力
 
	}
}