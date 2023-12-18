import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long P = sc.nextLong();


		long ans = 1L;

		if(N>=P) {

			System.out.println(1);

		}else if(N==1) {

			System.out.println(P);

		}else {

			long i = 2L;

			boolean flag = false;

			while(true) {

				if(P==1) break;

				flag = false;


				for(int j=2;j<=i/2;j++) {

					if(i%j==0) {

						flag = true;

						break;

					}

					if(i%(i-j+1)==0) {

						flag = true;

						break;
					}
				}




				if(flag==false) {

					long count = 0;

					while(flag==false&&P%i==0) {

						P /= i;

						count++;

						//System.out.println(i);

					}



					if(count/N!=0) {

						ans *= (count/N)*i;

					}
					//System.out.println("i"+i);

				}

				i++;


			}

			System.out.println(ans);
		}
	}

}
