import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {

			final int n = sc.nextInt();
			final int k = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && k == 0 && m == 0){
				break;
			}
			
			int ans = 0;
			for(int i = 2; i < n; i++){
				ans += k;
				ans %= i;
			}
			
			ans += m;
			ans %= n;
			
			ans++;
			
			System.out.println(ans);
			
		}
	}

}