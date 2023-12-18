import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int x = scan.nextInt();
			
			int[] a = new int[N+1];
			
			int ans = 0;
			
			for(int i = 1; i<=N; i++){
				a[i] = scan.nextInt();
				int diff = a[i-1] + a[i] - x;
				if(diff>0){
					ans += diff;
					a[i] -= diff;
				}
			}
			
			System.out.println(ans);
		}
	}
}
