import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int ans = -1;
		for(int i=0; i<n; i++) {
			int tmp = a[i];
			if(i==0) {
				tmp=a[i+1];
			}else {
				tmp=a[i-1];
			}
			for(int j=0; j<n; j++) {
				if(i!=j) {
					tmp = gcd(tmp, a[j]);
				}
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
		sc.close();
	}

	private int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
