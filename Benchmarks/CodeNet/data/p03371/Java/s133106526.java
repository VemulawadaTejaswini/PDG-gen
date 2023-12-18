import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int a =stdin.nextInt();
		int b =stdin.nextInt();
		int c =stdin.nextInt();
		int x =stdin.nextInt();
		int y =stdin.nextInt();
		int set=0;
		if(x<y) {
			set=x;
			if(a+b<2*c) {
				System.out.println(a*x+b*y);
			}else {
				System.out.println(set*c*2+(x-set)*a);
			}
		}else {
			set=y;
			if(a+b<2*c) {
				System.out.println(a*x+b*y);
			}else {
				System.out.println(set*c*2+(y-set)*b);
			}
		}
		

		


	}

}
