import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int h[]=new int[n];
		for(int i=0; i<n; i++) {
			h[i]=sc.nextInt();
		}
		Arrays.sort(h);
		int ans = 1001001001;
		for(int i=0; i<n-k+1; i++) {
			ans=Math.min(ans, Math.abs(h[i] - h[i+k-1]));
		}
		System.out.println(ans);
		sc.close();
	}

}
