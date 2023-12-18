import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long A[]= new long[N];
		for (int i=0;i<N;i++) {
			A[i]= sc.nextLong();
		}
		int count =1;
		Arrays.sort(A);
		long start =A[0];
		long num =1;
		for (int i=1;i<N;i++) {
			if (start+K>=A[i]&&num<C) {
				num ++;
			} else {
				start=A[i];
				num =1;
				count ++;
			}
		}
		System.out.println(count);
	}
}