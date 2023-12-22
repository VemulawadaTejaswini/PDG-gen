import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() + 1;
		long[] A = new long[N];
		long ans = 1;
		long[] tyoten = new long[N];
		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
		}
		tyoten[0] = 1;
		if(A[0] > 0){
			tyoten[0]--;
		}
		if(N == 1 && A[0] != 1){
			ans = -1;
		}
		for(int i = 1;i < N;i++){
			tyoten[i] = tyoten[i-1]*2;
			ans += tyoten[i];
			tyoten[i] -= A[i];
			if(tyoten[i] < 0){
				ans = -1;
				break;
			}
		}
		if(ans != -1 && N > 1){
			long[] tyo = new long[N];
			ans -= tyoten[N-1];
			if(A[N-1] < tyoten[N-2]){
				tyo[N-2] = A[N-1];
			}else{
				tyo[N-2] = tyoten[N-2];
			}
			for(int i = N - 2;i > 0;i--){
				ans -= tyoten[i];
				ans += tyo[i];
				if(A[i] + tyo[i] < tyoten[i-1]){
					tyo[i-1] = A[i] + tyo[i];
				}else{
					tyo[i-1] = tyoten[i-1];
				}
			}
		}
		System.out.println(ans);
	}
}
