import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N*2];
		int count =0;
		for (int i=0;i<N*2;i++) {
			A[i]= sc.nextInt();
		}
		Arrays.sort(A);
		for (int i=0;i<N*2;i+=2) {
			count +=A[i];
		}
		System.out.print(count);
	}
}