import java.util.Scanner;
public class EasyLinner_167B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();

int re = 0;


		if(k <= a+b+c && a+b+c <= 2*Math.pow(10, 9)) {
		for(int i=1;i<=a;i++) {
for(int j= 1;j<=b;j++) {
			re = i*1+j*0+(k-i-j)*(-1);
		}
		}
		System.out.println(re);
		}
	}

}
