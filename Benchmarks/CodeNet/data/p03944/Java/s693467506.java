import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int xl = 0; int xr = w;
		int yl = 0; int yr = h;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a == 1) xl = x;
			else if(a == 2) xr = x;
			else if(a == 3) yl = y;
			else yr = y;
		}
		System.out.println(xr>xl&&yr>yl?(xr-xl)*(yr-yl):0);
		sc.close();
	}
}