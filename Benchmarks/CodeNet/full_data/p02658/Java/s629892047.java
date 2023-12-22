import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] array = new long[N];
		long ans = 1;

		for(int i = 0;i<N;i++) {
			array[i] = sc.nextLong();
		}

		int j =0;
		while( j<N) {
			 ans *= array[j];
			j++;
			}

		if(ans >1000000000000000000L) {
			System.out.println("-1");
		}else {
			System.out.println(ans);
		}

	}

}

