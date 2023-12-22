import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			String S = scan.next();
			char[] c = new char[N];
			c = S.toCharArray();

			int[]R = new int[N];Arrays.fill(R, 1000000);
			int[]W = new int[N];Arrays.fill(W,1000000);

			int k = 0;
			for(int i = 0;i<N;i++) {
				if(c[i]=='W') {
					W[k] = i;k++;
				}
			}

			int j = 0;
			for(int i = N-1;i>=0;i--) {
				if(c[i]=='R') {
					R[j] = i;j++;
				}
			}

			int count = 0;
			for(int i = 0;i<N;i++) {
				//System.out.println(W[i]+" "+R[i]);
				if(W[i]<R[i])count++;
				else break;

			}


			System.out.println(count);




		}


	}





}
