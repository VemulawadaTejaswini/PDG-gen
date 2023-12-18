
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
		long cnt = 0;
		long bcnt = 0;
		long memo = -1;
		long waru = 998244353;
		for(int i=0;i<=N;i++) {
			if(memo==D[i])cnt++;
			else {
				if(memo+1!=D[i] && i!=0 && i!=N) {
					System.out.println(0);
					return;
				}
				long tmp = (long)Math.pow(bcnt+1,cnt+1);
				tmp%=waru;
				sum *= tmp;
				sum%=waru;
				bcnt = cnt;
				cnt=0;
			}
			memo = D[i];
		}
		
		System.out.println(sum%waru);
		
	}
}