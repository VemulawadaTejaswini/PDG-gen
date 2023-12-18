import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = b;
		if(a <= 5) {
			ans = 0;
		}else if(a < 13) {
			ans /= 2;
		}
		System.out.println(ans);
		sc.close();
	}
}
