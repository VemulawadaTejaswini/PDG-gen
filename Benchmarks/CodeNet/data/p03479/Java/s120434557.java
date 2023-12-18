import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextLong();
		long y = scan.nextLong();
		scan.close();
		
		int ans = 0;
		while(x <= y) {
			ans++;
			x *= 2;
		}
		System.out.println(ans);
	}
}