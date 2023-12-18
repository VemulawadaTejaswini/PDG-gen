import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ball count
		int K = sc.nextInt(); // suite ? 
		int[] A = new int[N+1]; // ball number
		for(int i=0; i<N; i++){
			A[sc.nextInt()] ++;
		}
		int count = 0;
		for(int k=0; k<A.length; k++) {
			if (A[k] > 0) count++;
		}
		int res = 0;
		if (count > K) res = (count-K);
		System.out.println(res);
	}
}