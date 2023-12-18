
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		
		int [][]c = new int [10][10];
		
		int temp = 0;
		for(int i = 1 ;i <= n ;i++) {
			
			if(i == Math.pow(10, temp+1)) {
				temp++;
			}
			
			int pow10 = (int)Math.pow(10,temp);
			c[i/pow10][i%10]++;
		}
		
		long ans = 0;
		
		for(int i = 1 ;i <= 9 ;i++) {
			for(int j = 1 ; j <= 9 ;j++) {
				ans += (long)c[i][j]*c[j][i];
			}
		}
		
		System.out.println(ans);

	}

}
