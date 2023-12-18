import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int res = String.valueOf(N).length();;
		int n = (int)Math.sqrt(N);
		for (int i=1; i<n; i++) {
			if ( N%i==0 ) {
				int tmp = Math.max(String.valueOf(N/i).length() 
							,String.valueOf(i).length());
				res = Math.min(res,  tmp);
			}
		}
		System.out.println(res);
	}
}
