import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int s = N / K;
		long count = 0;
		if (K/2 <= N) { 
			if (K%2==1) {
				count = (long)s*(long)s*(long)s;
			} else {
				if (N%K==0) {
					count = (long)s*(long)s*(long)s*(long)2;
				} else {
					count = (long)s*(long)s*(long)s + (long)(s+1)*(long)(s+1)*(long)(s+1);
				}
			}
		}




		System.out.println(count);

	}

}