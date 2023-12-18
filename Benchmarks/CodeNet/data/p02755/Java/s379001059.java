import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean bool = false;
		double ans = a / 0.08;
		if(Math.floor(ans * 0.1) == b) {
			bool = true;
		}else {
			ans = b / 0.1;
			if(Math.floor(ans * 0.08)  == a) {
				bool = true;
			}
		}
		if(bool) {
			System.out.println((int)ans);
		}else {
			System.out.println("-1");
		}

		sc.close();
	}
}