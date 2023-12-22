import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		while(true) {
			long b = sc.nextLong();
			if(b == 0) {
				break;
			}
			long n_k1 = 0;
			long kn= 0;
			long sqB = (long)Math.sqrt(2*b);
			long n = 0;
			long k = 0;

			for(long i = sqB; i >0 ; i--) {
				if(2*b%i == 0) {
					//i がn-k+1
					n_k1= i;
					kn = 2*b/i;

					if((n_k1 -1 + kn)%2 == 0) {
						 n = (n_k1 -1 + kn)/2;
						 k = kn -n;
						break;
					}

				}
			}



			System.out.println(k +" "+ n_k1);

		}
	}
}

