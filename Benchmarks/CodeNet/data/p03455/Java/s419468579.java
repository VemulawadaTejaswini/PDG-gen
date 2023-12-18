
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	int N;
	int t[];
	int x[];
	int y[];
	public void run() {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		t = new int[N+1];
		x = new int[N+1];
		y = new int[N+1];

		t[0]=0;
		x[0]=0;
		y[0]=0;
		for(int i=1; i<=N; i++) {
			t[i]=sc.nextInt();
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}

		boolean ans = true;
		for(int i=1; i<=N; i++) {
			int dt = t[i] - t[i-1];
			int dist = Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
			if(dt<dist) ans = false;
			if(dt%2 != dist%2) ans = false;
			if(!ans) break;
		}
		if (ans) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}
