import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
		int max = 0;
		for(int x = 0; x <= n; x++) {
			ans = ( a * x / b ) - ( x / b );
			//System.out.println(x + "," + ans);
			if(ans > max)
				max = ans;
		}
		System.out.println(max);
	}
}
