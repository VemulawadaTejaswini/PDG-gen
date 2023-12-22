import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int [] time = new int[n];
		for(int i=0;i<n;i++) {
			time[i] = sc.nextInt();
		}
		int loss = m;
		for(int i=1;i<n;i++) {
			if(time[i]-time[i-1] > 2*m) {
				loss += 2*m;
			}else {
				loss += time[i]-time[i-1];
			}
		}
		if(t-time[n-1]>m) {
			loss += m;
		}else {
			loss += t-time[n-1];
		}
		System.out.println(t-loss);
	}
}
