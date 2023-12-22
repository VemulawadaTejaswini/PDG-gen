import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] p = new int[N];
		int[] np = new int[100-N+2];
		if(N==0) {
			System.out.println(X);
			System.exit(0);
		}
		for(int i=0;i<N;i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		int pc = 0;
		np[0] = 0;
		np[100-N+1] = 101;
		int npc = 1;
		for(int i=0; i<100; i++) {
			if(pc < N && i+1 == p[pc]) {
				pc++;
			}else {
				np[npc] = i+1;
				npc++;
			}
		}
		int res = 100;
		int diff = 100;
		for(int i=np.length-1; i>=0; i--) {
			if(diff>=Math.abs(X-np[i])) {
				res = np[i];
				diff = Math.abs(X-np[i]);
			}
		}
		System.out.println(res);
	}
}
