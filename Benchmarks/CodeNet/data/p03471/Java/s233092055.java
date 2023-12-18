import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, y;
		n = sc.nextInt();
		y = sc.nextInt();
		
		sc.close();
		
		y /= 1000;

		int x = -1, z = -1, ans = -1;
		
		for(int i = 0; i <= n; ++i) {
			for(int j = 0; j + i <= n; ++j) {
				int tmp = y - 5 * i - 10 * j;
				if(tmp + i + j == n && tmp >= 0) {
					x = i;
					z = j;
				}
			}
		}
		if(x != -1)ans = y - 5 * x - 10 * z;
		System.out.println(z + " " + x + " " + ans);
	}

}
