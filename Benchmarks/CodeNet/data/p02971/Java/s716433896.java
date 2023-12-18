import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
		}

		int[] maxs = new int[N];
		for(int j=0;j<N;j++) {
			maxs[j] = 0;
			for(int i=0;i<N;i++) {

				if(i==j) {

				}else if(maxs[j] < A[i]) {
					maxs[j] = A[i];
				}
			}
			System.out.println(maxs[j]);
		}
	}

}