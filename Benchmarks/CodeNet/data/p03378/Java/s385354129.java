import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB();
	}

	private void solveB() {
		int min = 0;
		int max = 0;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[M-1];
		for (int i = 0; i < M-1; i++) {
			A[i] = sc.nextInt();
		}

		for (int j = 0; X > A[j] || j<=M-1; j++) {
			min = min + 1;
		}
		for (int k = M-1; X < A[k] || k <=0; k--) {
			max = max + 1;
		}

		if(min>max) {
			System.out.println(max);
		}else if(min<max){
			System.out.println(min);
		}else {
			System.out.println(min);
		}



		return;
	}

}