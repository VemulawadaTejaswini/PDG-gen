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
		a[0]=0;
		for(int i=1; i<=n; i++) a[i]=sc.nextInt();
		a[n+1]=0;

		for(int i=1; i<n+1; i++) {
			long sum = 0;
			int prev=0;
			for(int j=1; j<n+2; j++) {
				if(i != j) {
					sum += Math.abs(a[j] - a[prev]);
					prev=j;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
