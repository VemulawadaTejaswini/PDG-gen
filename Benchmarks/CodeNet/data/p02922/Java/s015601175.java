import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,b;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		b = sc.nextInt();

		if(b==1) {
			System.out.println(b);
		}

		else if(b%a!=0) {
			System.out.println(b/a+1);
		}

		else {
			System.out.println(b/a);
		}
	}

}