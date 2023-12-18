import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n+2];
		int s[] = new int[n+2];
		a[0]=0;
		for(int i=1; i<=n; i++) a[i]=sc.nextInt();
		a[n+1]=0;

		s[0]=0;
		for(int i=1; i<=n+1; i++) {
			s[i]=s[i-1]+ Math.abs(a[i]-a[i-1]);
		}

		for(int i=1; i<n+1; i++) {
			long ans = 0;
			if((a[i] <a[i-1] && a[i] < a[i+1]) || (a[i] > a[i-1] && a[i] > a[i+1])){
				ans = s[i-1] + Math.abs(a[i+1]-a[i-1]) + s[n+1] - s[i+1];
			} else {
				ans = s[n+1];
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
