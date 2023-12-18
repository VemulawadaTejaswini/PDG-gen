import java.util.*;

public class Main {
	/*
	 * input : N * K
	 *         A1 , A2 .... An
	 * output : 回数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for(int i=0;i<N;i++) {
			int ai = sc.nextInt();
		}
		int count = (N-1)/(K-1);
		if((N-1)%(K-1) != 0) {
			count += 1;
		}
		System.out.println(count);
	}


}