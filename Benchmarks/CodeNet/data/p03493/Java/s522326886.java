import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a;
		int ans=0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		for(int i = 0; i < 3; ++i) {
			if(a%10 == 1) {
				ans++;
			}
			a /= 10;
		}
		System.out.println(ans);
	}
}
