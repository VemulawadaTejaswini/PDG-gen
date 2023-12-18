
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D[] = new int[N+1];
		for(int i=0;i<N;i++) D[i]=sc.nextInt();//initialized
		D[N]=N+100;
		if(D[0]!=0) {
			System.out.println(0);
			return;
		}
		Arrays.sort(D);
		long sum = 1;
		int cnt = 0;
		int bcnt = 0;
		int memo = -1;
		for(int i=0;i<=N;i++) {
			if(memo==D[i])cnt++;
			else {
				if(memo+1!=D[i] && i!=0 && i!=N) {
					System.out.println(0);
					return;
				}
				sum *= Math.pow(bcnt+1,cnt+1);
				bcnt = cnt;
				cnt=0;
			}
			memo = D[i];
		}
		int tmp = 998244353;
		System.out.println(sum%tmp);
		
	}
}