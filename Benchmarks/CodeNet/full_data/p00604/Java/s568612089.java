import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = stdIn.nextInt();
			}
			Arrays.sort(a);
			int ans = 0;
			for(int i=0;i<n;i++){
				ans += a[i] * (n-i);
			}
			System.out.println(ans);
		}
	}
}