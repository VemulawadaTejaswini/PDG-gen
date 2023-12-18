import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		int c = 0;

		if ( (b-a)%2 == 0 ) {
			System.out.println((b-a)/2);
			System.exit(0);
		}

		// 出力
		System.out.println(Math.min(n-a,b-1));
	}
}