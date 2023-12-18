import java.util.Scanner;

public class Main {
	static final long MOD = 1_000_000_000 + 7;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		
		long sum = 0;
		for (int i = 0; i < 1 << (len - 1); i++) {
			int n = i;
			int l = 0;
			
			for (int j = 1; j < len; j++) {
				if ((n & 1) == 1) {
					sum += Long.valueOf(s.substring(l, j));
					l = j;
				}
				n /= 2;
			}
			sum += Long.valueOf(s.substring(l));
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}


