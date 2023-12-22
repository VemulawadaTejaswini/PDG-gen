import java.util.Scanner;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		long[][] f = new long[10][1001];
		f[0][0] = 1;
		for(int x=0; x<=100; x++) {
			for(int t=9; t>0; t--) {
				for(int i=0; i<=1000; i++) {
					if(i>=x) {
						f[t][i] += f[t-1][i-x];
					}
				}
			}
		}
		while(true) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0) break;
			System.out.println(f[n][s]);
		}
	}
}
