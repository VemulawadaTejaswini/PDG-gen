import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int len = 1;
		int sum = 0;
		for(int i = 0;i < N-1;i++) {
			if(A[i]==A[i+1]) {
				len++;
			}else {
				sum += len/2;
				len=1;
			}
		}
		if(len > 1) {
			sum += len/2;
		}
		System.out.println(sum);
	}
}