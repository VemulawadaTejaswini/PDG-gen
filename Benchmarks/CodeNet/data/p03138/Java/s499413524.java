import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long nisin = 1;
		while(nisin < k){
			nisin *= 2;
		}
		nisin /= 2;
		long sum1 = 0;
		long sum2 = 0;
		for(int i = 0; i < n; i ++) {
			sum1 += nisin ^ a[i];
		}
		for(int i = 0; i < n; i ++) {
			sum2 += (nisin / 2) ^ a[i];
		}
		if(sum1 > sum2) {
			System.out.println(sum1);
		}else {
			System.out.println(sum2);
		}
	}
}