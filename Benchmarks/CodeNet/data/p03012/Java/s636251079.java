import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] W = new int[N];
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			W[i] = x;
			sum += x;
		}
		
		double half = (double)sum / 2;
		sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += W[i];
			if(sum >= half)break;
		}
		
		System.out.println((int)((double)sum - half) * 2);
	}
}