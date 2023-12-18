
import java.util.Scanner;
//057C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		long n =sc.nextLong();
		int rootN= (int) (Math.sqrt(n));
		long ans =n;
		for (int i=1;i<=rootN;i++) {
			if(n%i==0) {
				long j=n/i;
				String s=String.valueOf(Math.max(i, j));
				ans =Math.min(s.length(),ans);
			}
		}
		System.out.println(ans);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}