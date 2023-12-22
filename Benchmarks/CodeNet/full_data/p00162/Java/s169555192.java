
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 1000000;
		boolean[] map = new boolean[N + 1];
		for (int i = 1; i <= N; i *= 2) {
			for (int j = 1; i * j <= N; j *= 3) {
				for (int k = 1; i * j * k <= N; k *= 5) {
					int s = i*j*k;
					map[s] = true;
				}
			}
		}
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m =scanner.nextInt();
			int c = 0;
			for(int i=n;i<=m;i++){
				if(map[i])
					c++;
				
			}
			System.out.println(c);
		}
	}
}