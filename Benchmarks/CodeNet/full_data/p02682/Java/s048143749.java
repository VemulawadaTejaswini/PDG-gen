import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		long K = sc.nextInt();
		long ans = 0;
		long max = 0;


		for ( long a = 0; a <= A; a++){

			for ( long b = 0; b <= B; b++){
				long c = K - a - b;

				if ( c < 0  || c > C){
					continue;
				}

				ans = a * 1 + b * 0 + c * -1;

				if (ans > max){
					max = ans;
				}
			}

		}

		System.out.println(max);

	}

}
