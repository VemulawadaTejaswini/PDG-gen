import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int k = scanner.nextInt();
		long sum = (long) 0;

		for(int i = k;i<=n+1;i++) {
			long cur = (long)(n-i+1)*i+ 1;
		
			sum = sum + cur ;
		}
		sum  = sum % 1000000007;
		System.out.println(sum);
	}


}