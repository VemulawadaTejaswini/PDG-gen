import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] H = new int[N+1];
		int[] MaxH = new int[N+1];
		for(int i = 0;i < N;i++) {
			int h = scn.nextInt();
			H[i+1] = h;
			MaxH[i+1] = Math.max(h, H[i]);
		}
		int ans = 0;
		for(int i = 0;i < N;i++) {
			if(MaxH[i] <= H[i+1]) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
