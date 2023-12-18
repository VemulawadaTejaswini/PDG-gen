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
		
		int now  = 0;
		
		for(int i = 0; i < N; i++) {
			now += W[i];
			if(now * 2 >= sum)break;
		}
		
		System.out.println(now * 2 - sum);
	}
}