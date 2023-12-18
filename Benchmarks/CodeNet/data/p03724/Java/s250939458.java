import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cnt = new int[N];
		for(int i=0; i<M*2; i++) {
			cnt[sc.nextInt()-1]++;
		}
		
		boolean ok = true;
		for(int i=0; i<N; i++) {
			if(cnt[i]%2!=0) {
				ok = false;
				break;
			}
		}
		
		System.out.println(ok ? "YES" : "NO");
		
		sc.close();
	}
}
