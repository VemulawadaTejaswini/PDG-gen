import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt[] = new int[n+1];
		for(int i=0; i<n-1; i++) {
			int v = sc.nextInt();
			cnt[v]++;
		}
		for(int i=1; i<=n; i++) {
			System.out.println(cnt[i]);
		}
		sc.close();
	}


}
