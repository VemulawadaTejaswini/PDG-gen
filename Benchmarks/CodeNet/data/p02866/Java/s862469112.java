import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		if (A[0]!=0) {
			System.out.println(0);
			return ;
		}
		Arrays.parallelSort(A);
		long B[] = new long[N];
		for (int i=1;i<N;i++) {
			if (A[i]!=A[i-1]&&A[i]!=A[i-1]+1) {
				System.out.println(0);
				break;
			}
			B[A[i]]++;
		}
		long count =1;
		B[0]=1;
		for (int i=1;i<N;i++) {
			if (B[i]==0) {
				break;
			}
			for (int j=0;j<B[i];j++) {
				count = (count *B[i-1])%998244353;
			}
		}
		System.out.println(count);
	}
}