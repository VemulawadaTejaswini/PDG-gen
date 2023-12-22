import java.util.Arrays;
import java.util.Scanner;
 public class Main
 
 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	long ans =1;
	long[] A = new long[N];
	
	for(int i=0; i<N; i++) {
		A[i] = s.nextLong();
	}//ここまで入力
	Arrays.sort(A);
	long limit = (int)1e18;
	for(int k=0; k<N; k++) {
		if(A[k] == 0 ) {ans =0; break;}
		if(A[k] <= limit/ans) { ans*= A[k];}
		else {ans = -1; break;}
	
		
		
	}
	
	
	System.out.println(ans);
	}
}
