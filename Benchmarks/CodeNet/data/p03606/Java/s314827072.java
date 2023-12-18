import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] All = new int[2*N];
		int ans = 0;

		for(int i=0; i<2*N; i++) {
			All[i] = sc.nextInt();
			if(i%2 == 0) {
				ans -= All[i];
			}else {
				ans += All[i];
			}
		}
		System.out.println(ans + N);

	}

}
