import java.*;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int List[];
	static int[] status;
	static int Answer,Min;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		K = ss.nextInt();
		List = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			List[i] = ss.nextInt();
		}
		int flag=1;
		int num = K;
		for (int i = 1; i < N; i++) {
			if(List[N]<0) {
				flag = N+1;
				break;
			}
			if(List[i]<0 && List[i+1]<0)continue;
			if(List[i]==0) {
				flag = i;
				num = K-1;
				break;
			}
			if(List[i]<0 && List[i+1]>0) {
				flag =i+1;
				break;
			}	
		}
		Answer = Integer.MAX_VALUE;
		int L=0;
		int R=0;
		int cnt=0;
		for (int i = num; i >=0; i--) {
			if(flag == N+1) {
				cnt = Math.abs(List[N-K+1]);
				Answer = Math.min(cnt, Answer);
				break;
			}
			L = flag-i;
			R = flag+(K-1-i);
			if(L<=0 || R>N)continue;
			if(List[R]<=0) {
				cnt = Math.abs(List[L]);
				Answer = Math.min(cnt, Answer);
				continue;
			}
			if(List[L]>=0) {
				cnt = Math.abs(List[R]);
				Answer = Math.min(cnt, Answer);
				continue;
			}
			cnt = Math.min(Math.abs(List[L])*2+List[R], Math.abs(List[L])+List[R]*2);
			Answer = Math.min(cnt, Answer);
		}

		System.out.println(Answer);
	}


}
