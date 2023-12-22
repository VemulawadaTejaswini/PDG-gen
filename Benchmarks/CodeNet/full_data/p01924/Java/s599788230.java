import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int D = sc.nextInt();
		int L = sc.nextInt();
		while(T+D+L != 0) {
			int[] x = new int[T];
			for(int i = 0; i < T; i++) {
				x[i] = sc.nextInt();
			}
			int ans = 0;
			int sec = 0;
			for(int i = 0; i < T-1; i++) {
				if(x[i] >= L) {
					ans ++;
					sec = D-1;
				}else if(sec > 0) {
					ans ++;
					sec --;
				}
			}
			System.out.println(ans);
			T = sc.nextInt();
			D = sc.nextInt();
			L = sc.nextInt();
		}
		sc.close();
	}
}

