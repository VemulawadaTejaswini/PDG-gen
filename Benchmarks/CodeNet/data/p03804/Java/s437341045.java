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
		Serch: {
			for(int i = 0; i < N-M+1; i++) {
				for(int j = 0; j < N-M+1; j++) {
					for(int k = 0; k < M; k++) {
						if(A[i+k].substring(j,j+M).equals(B[k].substring(0))) {
							count++;
						}else {
							count = 0;
							break;
						}
						if(count == M) {
							break Serch;
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
