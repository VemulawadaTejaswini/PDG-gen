import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] V = new long[N];
		for(int i=0; i<N; i++)
			V[i] = sc.nextLong() | (sc.nextLong()<<30);
		
		Arrays.sort(V);
		
		boolean ok = true;
		long now = 0;
		for(int i=0; i<N; i++) {
			long A = V[i] & ((1<<30)-1);
			long B = V[i]>>30;
			now += A;
			if(now>B) {
				ok = false;
				break;
			}
		}
		
		System.out.println(ok ? "Yes" : "No");
		sc.close();
	}
}