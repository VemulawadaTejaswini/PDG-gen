import java.util.Scanner;
import java.util.Arrays;
public class Main {
	static boolean isPrime[] = new boolean[1000000];
	static int cnt,n;    //计数
	static int ans[] = new int[1000000];
	public static void initPrime() {
		Arrays.fill(isPrime, true);
		isPrime[1] = false;
		ans[1] = 0;
		for(int i=2;i<1000000;i++) {
			if(isPrime[i]) {
				ans[i] = ++cnt;
				for(int j=i*2;j<1000000;j+=i) {
					isPrime[j] = false;
				}
			}
			else
				ans[i] = cnt;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		initPrime();
		while(in.hasNext()) {
			int n = in.nextInt();
			System.out.println(ans[n]);
		}
		in.close();
	}
}
