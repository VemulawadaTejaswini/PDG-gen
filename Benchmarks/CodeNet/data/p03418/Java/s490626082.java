
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		for(int b=1;b<=N;b++) {
			int loop = N/b;
			int rem = N%b + 1;
			int tmp = Math.max(b-K, 0)*loop + Math.max(rem-K, 0);  
			cnt += tmp;
			if(K==0) {
				cnt -= 1;
			}
		}
		System.out.println(cnt);
	}
	
}
