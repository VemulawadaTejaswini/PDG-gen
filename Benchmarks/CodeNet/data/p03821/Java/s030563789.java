import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long time = 0L;
		long[] num = new long[n];
		long[] baisu = new long[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextLong();
			baisu[i] = sc.nextLong();
		}
		for(int i = n-1; i >= 0; i--) {
			long p = baisu[i]-(num[i]+time)%baisu[i];
			if(p!=baisu[i]) time+=p;
		}
		System.out.println(time);
	}
}