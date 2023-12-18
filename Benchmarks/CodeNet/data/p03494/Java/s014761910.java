import java.util.Scanner;
 
public class Main {
 
	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int min = 0;
		int ans = 0;
		for (int i = 0; i < num; i++) {
			ans = sc.nextInt();
			int cnt = 0;
			while (ans % 2 == 0) {
				ans /= 2;
				cnt++;
			}
			ans = Math.min(min, cnt);
		}
		System.out.println(ans);
	}
}