import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
int i= 0;

		if( i >= a && i <= b) {
		if(i%k == 0) {
			System.out.println("YES");
	}else {
		System.out.println("NO");
	}
		}
	}
}
