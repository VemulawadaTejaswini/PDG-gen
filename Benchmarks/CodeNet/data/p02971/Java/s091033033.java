import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int A[] = new int[N];
		int max_1 = 0, max_2 = 0;
		int kai;
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(scan.nextLine());
			if (max_1 < A[i] && max_2 < A[i]) {
				max_2 = max_1;
				max_1 = A[i];
				
			} else if (max_2 < A[i]) {
				max_2 = A[i];
			}
		}
		
		for (int i = 0; i < N; i++ ) {
			kai = max_1;
			if (max_1 == A[i]) {
				kai = max_2;
			}
			System.out.println(kai);
		}
				 
		scan.close();
	}

}
