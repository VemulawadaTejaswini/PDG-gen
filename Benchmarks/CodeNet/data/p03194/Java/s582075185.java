import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long P = sc.nextLong();


		long ans = 1L;

		if(N==1) {

			System.out.println(P);

		}else {

			long i = 2L;

			boolean flag = false;

			long count = 0;

			while(P%2==0) {

				P /= 2;

				count++;
			}

			if(count/N!=0) {

				ans *= (count/N)*i;

			}

			while(true) {

				if(P==1) break;

				flag = false;



					for(int j=3;j*j<=i;j+=2) {

						if(i%j==0) {

							flag = true;

							break;
						}
					}


				if(flag==false) {

					count = 0;

					while(flag==false&&P%i==0) {

						P /= i;

						count++;

					}



					if(count/N!=0) {

						ans *= (count/N)*i;

					}

				}

				i++;

			}


			System.out.println(ans);
		}
	}


}
