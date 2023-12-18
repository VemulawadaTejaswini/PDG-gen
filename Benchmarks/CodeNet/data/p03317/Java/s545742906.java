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
		List<Integer> input = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			int ai = sc.nextInt();
			input.add(i);
		}
		int count = getMinimization(K,N,input);
		System.out.println(count);
	}

	private static int getMinimization(int k, int n, List<Integer> input) {
		int index_1 = input.indexOf(1);				
		return (index_1/(k-1)) +((n-1-index_1)/(k-1));
	}

}