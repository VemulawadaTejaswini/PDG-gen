import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        long[] A = new long[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
        for(int i = 0; A[i] % 2 == 0; i++,count++) {
          A[i] /= 2;
          if(i == N-1) {
            i = 0;
          }
        }
		System.out.println(count);
	}
}