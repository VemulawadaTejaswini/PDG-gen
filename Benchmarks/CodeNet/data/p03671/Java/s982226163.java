import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 出力
		int sum=a+b;
		if(b>=a&&b>=c)
			sum = a+c;
		else if(a>=b&&a>=c)
			sum=b+c;
		System.out.println(sum);
	}
}
