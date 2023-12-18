import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long r = 0;
		for(int i=1;i<=n;i++) {
			if (i % 3 != 0 && i % 5 != 0) r += i;
		}
		
		System.out.println(r);
	}
}
