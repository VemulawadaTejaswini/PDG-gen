import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;

		if(A>=K) {
			sum += K;
			K=0;
		}
		else if(A<K) {
			sum += A*1;
			K -= A;
		}

		if(B>=K && K != 0) {
			sum += K*0;
			K = 0;
		}
		else if(B<K) {
			sum += B*0;
			K -= B;
		}

		if(C>=K && K != 0) {
			sum += K*-1;
			K = 0;
		}
		else if(C<K) {
			sum += C*-1;
			K -= C;
		}

		System.out.println(sum);

    }
}
