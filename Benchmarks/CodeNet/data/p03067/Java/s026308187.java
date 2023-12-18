import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a;
			int b,n;
			String result;
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			if (a>b) {
				if(a>n && n>b) {
					result="Yes";
					}
				else{
					result="No";
					}
				}
			else if(a<b){
				if(a<n && n<b) {
					result="Yes";
					}
				else{
					result="No";
					}
				}
			else{
					if(a==n ) {
						result="Yes";
						}
					else{
						result="No";
						}
				}
			// 出力

			System.out.println(result);
	}
}