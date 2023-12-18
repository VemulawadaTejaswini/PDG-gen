import java.util.Arrays;
import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];

		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		for(int i=0;i<N;i++) {
			System.err.println (A[i]);
		}
		int max=0;
		for(int k=0;k<K;k++) {
			int tmp=0;
			for(int i=0;i<N;i++) {
				tmp+=A[i]^k;
			}
			if(tmp>max)max=tmp;
		}
		System.out.println(max);
	}

}
