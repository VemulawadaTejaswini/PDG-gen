import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		if(a < b) {
			if(b - (a + W) > 0) {
				int ans = b - (a + W);
				System.out.println(ans);
				return;
			}else {
				System.out.println(0);
				return;
			}
		}else if(a > b) {
			if(a - (b + W) > 0) {
				int ans = a - (b + W);
				System.out.println(ans);
				return;
			}else {
				System.out.println(0);
				return;
			}
		}else {
			System.out.println(0);
		}
	}

}