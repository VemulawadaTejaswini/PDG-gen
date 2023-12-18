import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long taka[] = new long[n+2];
		long ao[] = new long[n+2];
		for(int i = 1; i <= n; i++) {
			taka[i] = sc.nextLong();
		}
		taka[0]=0;taka[n+1]=taka[n];
		for(int i = 1; i <= n; i++) {
			ao[i] = sc.nextLong();
		}
		ao[0]=ao[1];ao[n+1]=0;
		long ans = 1L;
		for(int i = 1; i <= n; i++) {
			if(taka[i-1]<taka[i]&&ao[i]>ao[i+1]) {
				if(taka[i]==ao[i]) {
				} else {
					System.out.println(0);
					return;
				}
			} else if(taka[i-1]<taka[i]&&ao[i]==ao[i+1]) {
			} else if(taka[i-1]==taka[i]&&ao[i]>ao[i+1]) {
			} else if(taka[i-1]==taka[i]&&ao[i]==ao[i+1]) {
				ans *= Math.min(taka[i], ao[i]);
				ans %= 1000000007;
			} else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(ans %= 1000000007);
	}
}