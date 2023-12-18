import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[M];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		boolean a = true;
		for(int i = x[N-1]; i <= y[0]; i++) {
			a = false;
			break;
		}
		if(a == true) {
			System.out.println("War");
		}else {
			System.out.println("No war");
		}
	}

}