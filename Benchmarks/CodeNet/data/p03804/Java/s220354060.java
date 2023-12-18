import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] A = new String[N];
		String[] B = new String[M];
		boolean found = false;
		for (int i = 0 ; i < N ; i++) {
			A[i] = sc.next();
		}
		for (int i = 0 ; i < M ; i++) {
			B[i] = sc.next();
		}

		for(int i = 0 ; i <= N - M ; i++) {
			for (int j = 0 ; j <= N - M ; j++) {
				for(int k = 0 ; k < N ; k++) {
					for(int l = 0; l < M ; l++) {
						if(A[i].charAt(k) == B[j].charAt(l)) {
							found = true;
						}
					}
				}
			}
		}
		System.out.println(found);
	}
}
