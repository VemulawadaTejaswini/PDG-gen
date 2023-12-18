
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int MAX = 200000;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int p[] = new int[MAX];
		for(int i=0; i<n; i++) {
			p[sc.nextInt()]++;
		}
		int cnt=0;
		for(int i=0; i<MAX; i++) {
			if(p[i]>0) cnt++;
		}
		Arrays.sort(p);

		int ans = 0;
		for(int i=0; i<MAX; i++) {
			if(p[i]==0) continue;
			if(cnt<=k) break;
			ans += p[i];
			cnt--;
		}
		System.out.println(ans);
		sc.close();
	}

}
