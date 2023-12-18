import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		long max = 0;
		for(int i = 1;i <= Math.min(A, N);i++){
			max = Math.max(max, (A*i)/B - A*(i/B));
		}
		System.out.println(max);
	}

}