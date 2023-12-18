import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long K=sc.nextLong();
		long[] A=new long[N];

		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}
		Arrays.sort(A);
//		for(int i=0;i<N;i++) {
//			System.err.println (A[i]);
//		}

		long tmp=A[0];
		for(int i=1;i<N;i++) {
			tmp=A[i]^tmp^K;
			}
		//System.err.println("tmp\t"+tmp);
		long ret=0;
		for(int i=0;i<N;i++) {
			ret+=A[i]^tmp;
			}
		ret=Math.max(tmp, ret);
		System.out.println(ret);

	}

}
