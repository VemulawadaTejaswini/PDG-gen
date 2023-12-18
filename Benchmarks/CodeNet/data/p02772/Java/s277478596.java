//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		boolean gu[] = new boolean[N];
		Arrays.fill(gu,false);
		int count = 0;
		for(int j=0;j<N;j++) {
			if(A[j]%2==0) {
				gu[j] = true;
				count ++;
			}
		}
//		for(int k=0;k<N;k++) {
//			System.out.println(gu[k]);
//		}
		int count2 = 0;
		for(int k=0;k<N;k++) {
			if(gu[k]) {
				if(A[k]%3==0||A[k]%5==0) {
					count2 ++;
				}
			}
		}
		if(count==count2) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	}
}