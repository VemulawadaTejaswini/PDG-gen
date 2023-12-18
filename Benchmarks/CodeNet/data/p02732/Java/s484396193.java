import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int buf = 0;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		Arrays.sort(A);
		int count = 1;
		int[] num = new int[N];
		num[A[0]] = 1;
		for(int i = 1;i < N;i++){
			if(A[i - 1] == A[i]){
				count++;
				if(i == N-1){
					num[A[i]] = count;
				}
			}else{
				num[A[i]] = count;
				count = 1;
				if(i == N-1){
					num[A[i]] = 1;
				}
			}
		}
		for(int i = 0;i < N;i++){
			buf += num[i] * (num[i] - 1) / 2;
		}
		for(int i = 0;i < N;i++){
			int ans = buf;
			ans -= (num[B[i]] - 1);
			System.out.println(ans);
		}
	}
}