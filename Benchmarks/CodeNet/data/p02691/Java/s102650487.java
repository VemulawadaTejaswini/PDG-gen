import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long ans = 0;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
		}
		for(int i = N - 1;i > 1;i--){
			for(int j = 0;j + i < N;j++){
				if(A[j] + A[j + i] == i){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}