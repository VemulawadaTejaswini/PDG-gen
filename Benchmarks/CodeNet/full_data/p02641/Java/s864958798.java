import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();

		int[] p = new int[N];
		for(int i=0; i<N; i++) {
			p[i] = sc.nextInt();
		}

		Arrays.sort(p);

		int ans = -1;
		int index = 0;
		for(int i=1; i<=100; i++) {
			if(index < N && i == p[index]) {
				index++;
				continue;
			}

			if(ans == -1) {
				ans = i;
			}else {
				if(Math.abs(i-X) < Math.abs(ans-X)) {
					ans = i;
				}
			}
		}

		System.out.println(ans);
	}

}
