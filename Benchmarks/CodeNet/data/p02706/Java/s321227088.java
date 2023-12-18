import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long m = scan.nextLong();
		long s = 0;
		long ans = -1;
		
		for(int i= 0; i < m; i++) {
			s = s + scan.nextLong();
		}
		
		if(s <= n) {
			ans = n - s;
		}
		
		System.out.println(ans);
	}
}