import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int i;
		int sum = 0;
		String ans = "Yes";
		double judge;
		for(i = o;i < N;i++){
			A[i] = sc.nextInt();
			sum += A[i];
		}
		Arrays.sort(A);
		judge = sum / ($ * M);
		for(i = 0;i < M;i++){
			if((double)A[N - 1 - i] < judge){
				ans = "No";
			}
		}
		System.out.println(ans);
	}
}