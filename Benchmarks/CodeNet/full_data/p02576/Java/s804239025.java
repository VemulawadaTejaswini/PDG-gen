import java.util.Scanner;

public class Main {

	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		int a = 0;
		if(n%x ==0) {
			a = n/x;
		}
		else {
			a = n/x+1;
		}
		int ans = a*t;
		
		System.out.println(ans);
	}
}