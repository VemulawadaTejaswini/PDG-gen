
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long []a = new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Long.parseLong(sc.next());
		}
		
		long inf = 1000000000000000000L;
		Arrays.sort(a);
		long ans = 1L;
		
		for(int i = 0 ; i < n ;i++) {
			if(a[i] == 0) {
				System.out.println(0);
				return;
			}
			if(ans >= (inf/a[i])) {
				System.out.println(-1);
				return;
			}
			ans *= a[i];
		}
		System.out.println(ans);
	}

}
