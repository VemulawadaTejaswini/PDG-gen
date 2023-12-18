import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int ans = b*(t/a);
		if(t/a == 0) {
			ans += b;
		}
		System.out.println(ans);

		sc.close();
	}

}

