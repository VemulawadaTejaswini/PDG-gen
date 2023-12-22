//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long A[] = new Long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		long ans = 1;
		for(int j=0;j<N;j++) {
			ans *= A[j];
			if(ans>(long)Math.pow(10, 18)) {
				System.out.println(-1);
				System.exit(0);
			}
		}
//		if(ans>(long)Math.pow(10, 18)) {
//			System.out.println(-1);
//			System.exit(0);
//		}
		System.out.println(ans);
		//System.out.println((long)Math.pow(10, 18));
	}
}