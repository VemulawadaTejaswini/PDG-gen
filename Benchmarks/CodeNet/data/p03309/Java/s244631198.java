import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		int res = Integer.MAX_VALUE;
		for (int b=(-1*N); b<N; b++){
			int c = 0;
			for (int i=0; i<N; i++){
				c += Math.abs(A[i]-(b+(i+1)));
			}
			res = Math.min(res, c);
		}
		System.out.println(res);
	}
}
