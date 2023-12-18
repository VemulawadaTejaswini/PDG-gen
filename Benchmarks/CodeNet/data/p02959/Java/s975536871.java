import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		int B[] = new int[N];
		for(int i=0; i<N+1;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N;i++) {
			B[i] = sc.nextInt();
		}
		int DMG = 0;
		for(int i=0;i<N;i++) {
			if(A[i]<=B[i]) {
				B[i] = B[i] - A[i];
				DMG = DMG + A[i];
				A[i] = 0;
				if(B[i]!=0) {
					if(A[i+1]>=B[i]) {
						A[i+1] = A[i+1] - B[i];
						DMG = DMG + B[i];
					}else {
						B[i] = B[i] - A[i+1];
						DMG = DMG + A[i+1];
						A[i+1] = 0;
					}
				}
			}else {
				A[i] = A[i] - B[i];
				DMG = DMG + B[i];
				B[i] = 0;
			}
		}
		System.out.println(DMG);
	}

}