import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			A[i] %= M;
		}

		int count = 0;

		for(int j=0; j<N; j++) {
			for(int l=0; l<N-j; l++) {
				int judge = 0;
				for(int k=j; k<j+l; k++) {
					//int judge = 0;
					judge += A[k];
				}if(judge % M == 0) {
					count += 1;
				}
			}
		}
		System.out.println(count);

	}

}
