import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		long a = 0;
		long b = 0;
		long x = 0;
		long count = 0;
		long reserve = 0;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextLong();
		b = scan.nextLong();
		x = scan.nextLong();
		
		reserve = b / x;
		for(int i = 1; i < a; i++) {
			if(i % x == 0) {
				count++;
			}
		}
		if(a == 0) {
			count = -1;
		}
		System.out.println(reserve - count);
	}
}