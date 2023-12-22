import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			long[]A = new long[N];
			for(int i = 0;i<N;i++)A[i] = scan.nextLong();


			long ki = A[0];
			long goukei = 0;
			for(int i = 1;i<N;i++) {
				if(ki<=A[i]) {
					ki=A[i];
					//System.out.println(0);
				}else {
					goukei+=ki-A[i];
					//System.out.println(ki-A[i]);
				}

			}

			System.out.println(goukei);




		}


	}


}
