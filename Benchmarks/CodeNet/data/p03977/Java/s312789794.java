import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			int d = sc.nextInt();

			int ans = (n-1)*127;
			ans += (n%2==0)? (127-d) : d;

			System.out.println(ans);
		}
	}
}