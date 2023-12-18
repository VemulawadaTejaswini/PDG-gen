import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N==1) {
			System.out.println(1);
			return ;
		}
		int B[] = new int[N];
		if (M>0) {
			B = new int[M];
		}
		for (int i=0;i<M;i++) {
			B[i] = sc.nextInt();
		}
		long A[]= new long[N];
		int now =0;
		if (B[now]==1) {
			A[1]=1;
			now ++;
		}
		for(int i=2;i<N;i++) {
			if (now<M&&B[now]!=i) {
				A[i]=(A[i-1]+A[i-2])%1000000007;
			} else {
				now++;
			}
		}
		System.out.println((A[N-1]+A[N-2])%1000000007);
	}
}