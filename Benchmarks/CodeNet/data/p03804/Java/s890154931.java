import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] A = new String[N];
		String[] B = new String[M];

		for(int i = 0; i < N; i++) {
			A[i] = sc.next();
		}
		for(int i = 0; i < M; i++) {
			B[i] = sc.next();
		}

		int count = 0;
		for(int i = 0; i < N-M+1; i++) {
			for(int j = 0; j < N-M+1; j++) {
				if(A[i].substring(j,j+M).equals(B[0].substring(0))) {
					for(int k = 1; k < M; k++) {
						if(A[i+k].substring(j,j+M).equals(B[k].substring(0))) {
							count++;
						}else {
							count = 0;
							break;
						}
					}
				}
			}
		}

		if(count == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
