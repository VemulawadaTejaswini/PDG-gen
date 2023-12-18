import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		sc.close();
		
		int res = 0;
		int dif;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				dif = Math.abs(a[i]-a[j]);
				if(dif > res) res = dif;
			}
		}
		System.out.println(res);
	}
}