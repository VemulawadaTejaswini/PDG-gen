import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] p = new int[n];
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			p[i] = scan.nextInt();
		}
		
		if(n < 3) {
			for(int j=0;j<n;j++) {
				ans += p[j];
			}
		}else {
			Arrays.sort(p);
		
			for(int j=0;j<3;j++) {
				ans += p[j];
			}
		}
		System.out.println(ans);

	}

}
