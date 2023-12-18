
import java.util.Scanner;

public class Main {

	
	public static void main (String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] length = new long[n];
		
		for (int i=0;i<n;i++) {
			length[i]=sc.nextLong();
		}
		
		long total = 0;
		for (int i=0;i<n;i++) {
			total+=length[i];
		}
		long ans = total;
		long subTotal = 0;
		for (int i=0;i<n;i++) {
			subTotal+=length[i];
			ans = Math.min(ans, Math.abs(total-subTotal-subTotal));
		}
		System.out.println(ans);
	}
}
