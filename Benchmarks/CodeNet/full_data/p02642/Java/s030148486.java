import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] A = new int[1000001];
		int[] nms = new int[N];
		boolean one = false;
		for(int i = 0; i < N; i++) {
			int now = s.nextInt();
			A[now]++;
			nms[i] = now;
		}
		
		int ret = 0;
		for(int i = 0; i < N; i++) {
			if(!checkDivided(A, nms[i])) {
				ret++;
			}
		}
		System.out.println(ret);
	}
	
	// true 割り切れる　false 割り切れない
	private static boolean checkDivided(int[] A, int n) {
		int sqrt = (int)Math.sqrt(n);
		if(A[n] > 1) {
			return true;
		}
		if(n==1) {
			if(A[1] > 1) {
				return true;
			}else {
				return false;
			}
		}
		if(A[1] > 0) {
			return true;
		}
		for(int i = 2; i <= sqrt; i++) {
			int tmp = n;
			if(A[i] > 0 && n%i==0) {
				return true;
			}
			while(tmp%i==0) {
				tmp /= i;
				if(A[tmp] > 0) {
					if(n%tmp==0) {
						return true;
					}
				}
			}
		}
		return false;
	}
}