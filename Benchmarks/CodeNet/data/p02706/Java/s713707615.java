import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int s=0;
		for(int i=0; i<M; i++) {
			A[i] = sc.nextInt();
			s+=A[i];
		}
		if(s>N) {
			System.out.println(-1);
		}else {
			System.out.println(N-s);
		}
	}

}