import java.util.Scanner;

class Main{

	public static void main(String [] args) {

		long a, b;
		long gcd = 0;
		long temp;
		long lcm;


		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {


			a = sc.nextInt();
			b = sc.nextInt();

			temp = a;
			if(b > a) {

				temp = b;
			}

			for(int i= 1; i <= temp; i++) {

				if(a % i == 0 && b % i == 0) {

					gcd = i;
				}

			}


		lcm = a * b / gcd;
		System.out.printf("%d %d", gcd, lcm);

		}

	}

}