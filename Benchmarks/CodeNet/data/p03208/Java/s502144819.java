import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] tr=new int[N];
		for(int i=0; i<N; i++) {
			tr[i]=sc.nextInt();
		}
		Arrays.sort(tr);
		int max=Integer.MAX_VALUE;

		for(int i=0; i<=N-K; i++) {
			max=Math.min(max, tr[K-1+i]-tr[i]);
		}
		System.out.println(max);
	}
}