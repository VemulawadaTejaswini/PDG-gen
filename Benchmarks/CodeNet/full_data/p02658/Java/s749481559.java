
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);


		int N = scanner.nextInt();
		long[] A = new long[N];
		long ans=1L;
		long x=1L;

		for(int i=0 ; i<N ; i++) {
			A[i]=scanner.nextLong();
		}



		for(int i=0 ; i<N ; i++) {
			ans = ans * A[i];
			Math.incrementExact(ans);
		}

		for(int i=0 ; i<18 ; i++) {
			x = x * 10;
		}




		if(ans > x || ans<0) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}



		scanner.close();

	}

}
