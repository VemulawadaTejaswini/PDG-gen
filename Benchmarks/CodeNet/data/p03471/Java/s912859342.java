import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String sl[] = str.split(" ");
		
		long n = Long.parseLong(sl[0]);
		long yen = Long.parseLong(sl[1]);
		
		for(long z = 0; 10000 * z < yen; z++)
		{
			long y = (yen - 1000 * n - 9000 * z) / 4000;
			long x = n - z - y;
			if(x + y + z == n && 1000 * x + 5000 * y + 10000 * z == yen && x >= 0 && y >= 0 && z >= 0)
			{
				System.out.printf("%d %d %d", z, y, x);
				System.exit(0);
			}
		}

		System.out.printf("%d %d %d", -1, -1, -1);
	}
}