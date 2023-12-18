
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
		t = new int[N];
		x = new int[N];
		y = new int[N];

		for(int i=0; i<N; i++) {
			t[i]=sc.nextInt();
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}

		int dt = 0;
		int dx = 0;
		int dy = 0;
		boolean ans = false;
		for(int i=0; i<N; i++) {
			dt = t[i] - dt;
			dx = Math.abs(x[i] - dx);
			dy = Math.abs(y[i] - dy);
			if(dx + dy <= dt && (dt - (dx + dy)) % 2 == 0) ans = true;
			if(ans) continue;
			else break;
		}
		if (ans) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}
