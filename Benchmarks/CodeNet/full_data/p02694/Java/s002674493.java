import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextInt();
		
		long ans = 0;
		long yen = 100;
		while(x > yen) {
			yen += yen/100;
			ans++;
		}
		
		System.out.println(ans);
	}
}