import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int A[] = new int[N]; 
		int tmp,max;
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(scan.nextLine());
		}
		
		for(int i = 0; i < N; i++ ) {
			tmp = A[i];
			A[i] = 0;
			max = 0;
			
			for (int j = 0; j < N; j++) {
				if (max < A[j]) {
					max = A[j];
				}
			}
			
			System.out.println(max);
			A[i] = tmp;
		}
		 
		scan.close();
	}

}
