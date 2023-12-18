import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[] = new int[n];
		for(int i=0; i<n; i++) p[i] = sc.nextInt();
		int cnt=0;
		for(int i=1; i<n-1; i++) {
			if(p[i-1] < p[i] && p[i] < p[i+1] || p[i-1] > p[i] && p[i] > p[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
