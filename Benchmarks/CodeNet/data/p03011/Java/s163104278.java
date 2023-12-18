import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 出力
		if(a>b&&a>c) {
			System.out.println(b+c);
		}
		else if(b>a&&b>c) {
			System.out.println(a+c);
		}
		else {
			System.out.println(a+b);
		}
	}
}