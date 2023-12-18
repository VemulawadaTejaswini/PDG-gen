import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long a[] = new long[n];
		long sum = 0;

		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
			sum += a[i];
		}

		long up = (int)Math.ceil((double)sum/n - (double)(n+1)/2);
		long down = (int)Math.floor((double)sum/n - (double)(n+1)/2);

		long score = 0;
		for(int i=0;i<n;i++){
			score += Math.abs(a[i] - up - i - 1);
		}

		long score2 = 0;
		for(int i=0;i<n;i++){
			score2 += Math.abs(a[i] - down - i - 1);
		}

		System.out.println(Math.min(score,score2));

	}
 
}