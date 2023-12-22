import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x0 = sc.nextInt();
		int y0 = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		int xr = Math.abs(x1 - x0);
		int yr = Math.abs(y1 - y0);

		double ans = Math.sqrt(xr * xr + yr * yr);

		System.out.println(ans);

		sc.close();
	}
}
