import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A[] = new int[N];
		int step = 0;
		int stepTop = 0;
		A[0] = scan.nextInt();
		for(int i=1; i<N; i++) {
			A[i] = scan.nextInt();
			if(A[i-1] > A[i]) {
				if(A[i-1] - A[i] < stepTop) {
					step += stepTop;
				}else {
					step += A[i-1] - A[i];
					stepTop = step;
				}
			}
		}
		System.out.println(step);
	}
}
