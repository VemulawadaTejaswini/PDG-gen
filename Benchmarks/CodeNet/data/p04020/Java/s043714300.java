import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N+1];
		A[0] = 0;
		for(int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}

		int result = 0;
		int temp = 0;
		for(int i = 1; i < A.length; i++) {
			if(A[i] == 0) {
				result += temp / 2;
				temp = 0;
			}else {
				temp += A[i];
			}
		}
		result += temp / 2;

		System.out.println(result);
	}

}
