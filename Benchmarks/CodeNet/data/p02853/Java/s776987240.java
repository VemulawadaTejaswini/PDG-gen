
import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if (x<=3) {
			ans+=(400000-x*100000);
		}
		if (y<=3) {
			ans+=(400000-y*100000);
		}
		if (x==1 && y==1) {
			ans+=400000;
		}
		System.out.println(ans);

	}

}
