import java.util.Scanner;
 public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	long ans =1;
	long[] A = new long[N];
	
	for(int i=0; i<N; i++) {
		A[i] = s.nextLong();
		ans = ans * A[i];
		
		if(ans>1e18) {
			ans =-1; 
			for(int k=i; k<N; k++) {
				if(A[k] == 0 ) {
					ans =0; break;
				}
			}
			break;
		}
		
	}//ここまで入力
	
	
	
	System.out.println(ans);
	}
}