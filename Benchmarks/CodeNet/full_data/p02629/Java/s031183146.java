import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A[] = new long[11];
		long start = 26;
		A[0] = 26;
		for (int i = 1; i < 11; i++) {
			start *= 26;
			A[i] = start ;
		}
		long N = sc.nextLong();
		int i;
		for (i = 10; i >= 0; i--) {
			if (A[i] < N) {
				break;
			}
		}
		for (int j=i;j>=0;j--) {
			int temp =(int)( N/(A[j]));
			if (temp ==0) {
				System.out.print('a');
			} else {
				System.out.print((char)(temp+'a'-1));
			}
			N-=temp *(A[j]);
		}
		int temp = (int)N;
		System.out.println((char)(N+'a'-1));
	}
}
