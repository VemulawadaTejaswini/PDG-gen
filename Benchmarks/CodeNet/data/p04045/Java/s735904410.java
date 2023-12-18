import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] D = new int[K];
		for(int i = 0; i < K; i++)
			D[i] = sc.nextInt();
		int ans = N;
		while(true) {
			boolean ok = true;
			for(int i = 0; i < K; i++) {
				for(int j = 0; j < String.valueOf(ans).length(); j++) {
					if(D[i] == ans/(int)Math.pow(10, j)%10) {
						ok = false;
					}
				}
			}
			if(ok)
				break;
			ans++;
		}
		System.out.println(ans);
	}

}