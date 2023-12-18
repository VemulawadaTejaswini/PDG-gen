import java.util.Scanner;

public class Main {
	static int n;
	static int wayn;
	static int railn;
	static int max_n = 200001;
	static boolean visited[] = new boolean[max_n];
	static int[] ar;
	static int[] br;
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ar = new int[n+1];
		br = new int[n+1];
		wayn = sc.nextInt();
		railn = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			ar[i] = i;
			br[i] = i;
		}
		for(int i = 0; i < wayn; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			amerge(a, b);
		}
		for(int i = 0; i < railn; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			bmerge(a, b);
		}
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j <= n; j++) {
				if(agetRoot(ar[i])==agetRoot(ar[j]) && bgetRoot(br[i])==bgetRoot(br[j])) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	static void amerge(int a, int b) {
		ar[agetRoot(b)] = agetRoot(a);
	}
	static void bmerge(int a, int b) {
		br[bgetRoot(b)] = bgetRoot(a);
	}
	static int agetRoot(int n) {
		if(n == ar[n]) {
			return n;
		} else {
			return agetRoot(ar[n]);
		}
	}
	static int bgetRoot(int n) {
		if(n == br[n]) {
			return n;
		} else {
			return bgetRoot(br[n]);
		}
	}
}
