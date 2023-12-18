import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();


			long[][]A = new long[10][10];

			for(int i = 1;i<=N;i++) {

				String S = String.valueOf(i);
				char[]s = S.toCharArray();

				int f = (int)(s[0]-'0');
				int l = (int)(s[s.length-1]-'0');

				A[f][l]++;

			}

			long goukei = 0;

			for(int i = 1;i<=9;i++) {
				for(int j = 1;j<=9;j++) {
					//System.out.println(A[i][j]);


					goukei+= A[i][j]*A[j][i];
				}
			}



			System.out.println(goukei);

		}


	}


}
