import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long numy  = 6;
		long cnt = 0;

		long shou = x / 11;

		long kaisuu ;
		if ( x % 11 <= 5) {
			kaisuu = shou * 2 + 1;
		}else{
			kaisuu = shou * 2 + 2;
		}
		 System.out.println(kaisuu);

		sc.close();
	}

}
