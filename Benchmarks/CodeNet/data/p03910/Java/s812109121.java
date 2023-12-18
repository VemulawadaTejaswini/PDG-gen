import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long N = scan.nextLong();

			long L = 0;
			for(long i = 1;i<=N;i++) {
				long go = i*(i+1)/2;
				L = i;
				if(N<go) {
					L =  i-1;
					break;
				}

			}

			if(L==1) {
				System.out.println(N);
				return ;
			}


			long G=N-L*(L+1)/2;

			if(G<=L) {
				for(long i = 1;i<L;i++) {
					if(i==L-1) {
						long l = i;
						long r = i+1+G;
						System.out.println(l+(r-l-1)/2);
						System.out.println(r-(r-l-1)/2);

						break;
					}
					System.out.println(i);
				}
			}else {
				for(long i = 1;i<=L;i++) {
					if(i==L) {
						System.out.println(i+(G-L-1)/2);
						System.out.println(G-(G-L-1)/2);
						break;
					}
					System.out.println(i);
				}


			}



		}


	}


}
