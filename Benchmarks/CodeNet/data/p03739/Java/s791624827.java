import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int sum1 = 0;
			int cnt1 = 0;
			// a[0] > 0
			for(int i=0;i<n;i++) {
				sum1 += a[i];
				if(i%2==0 && sum1 <= 0) {
					cnt1 += (1-sum1);
					sum1 = 1;
				}else if(i%2==1 && sum1 >= 0) {
					cnt1 += (1+sum1);
					sum1 = -1;
				}
			}
			
			int sum2 = 0;
			int cnt2 = 0;
			// a[0] < 0
			for(int i=0;i<n;i++) {
				sum2 += a[i];
				if(i%2==1 && sum2 <= 0) {
					cnt2 += (1-sum2);
					sum2 = 1;
				}else if(i%2==0 && sum2 >= 0) {
					cnt2 += (1+sum2);
					sum2 = -1;
				}
			}
			
			System.out.println(Math.min(cnt1, cnt2));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}
