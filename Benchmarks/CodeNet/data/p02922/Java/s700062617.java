import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.close();
			if(b%a!=0) {
			System.out.print(b/a+1);
			}else
				System.out.print(b/a);
		}
	public static void main(String[] args) {
			solve();

	}

}
