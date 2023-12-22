import java.io.PrintWriter;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();

		int[] ans = new int[N];

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				for(int k=1; k<=N; k++) {
					int n = i*i+j*j+k*k+i*j+j*k+k*i;
					if(n<=N)
						ans[n-1]++;
				}
			}
		}
		for(int i=0; i<N; i++)
			pw.println(ans[i]);

		sc.close();
		pw.close();
	}
}