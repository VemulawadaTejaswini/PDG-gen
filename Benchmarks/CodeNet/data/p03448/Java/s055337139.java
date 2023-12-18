import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long x = sc.nextLong();
		x /= 50;
		long count = 0L;
		for (int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int l = 0; l <= c; l++) {
					if(10*i+2*j+l==x) {
						count++;
					}
				}
			}

		}
		System.out.println(count);
	}
}