import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long K = scan.nextLong();
			long A = scan.nextLong();
			long B = scan.nextLong();

			if(B-A>2) {
				if(1+K<A+2) {
					System.out.println(1+K);
				}else {

					K=K-(A-1);

					long s = K/2;
					long r = K%2;

					long goukei =1+(A-1)+s*(B-A)+r;


					System.out.println(goukei);

				}

			}else{
				System.out.println(1+K);
			}

		}


	}



}
