import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[N+1];
		for(int i = 0;i < N;++i)
			x[i] = sc.nextInt();
		sc.close();
		x[N] = X;
		
		if(N == 1) {
			System.out.println(Math.abs(X - x[0]));
		}else {
			int[] sub = new int[N];
			for(int i = 0;i < N;++i)
				sub[i] = Math.abs(x[i] - X);
			Arrays.sort(sub);
			
			int gcd = 0;
			for(int i = sub[0];i >= 1;--i) {
				boolean flag = true;
				for(int j = 0;j < N-1;++j) {
					if(sub[j] % i != 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					gcd = i;
					break;
				}
			}
			
			System.out.println(gcd);
		}
	}
}
