

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		int plus = 0;
		int temp = 0;
		for(int i=n-1; i>=0; i--){
			temp = a[i]+plus;
			if(temp%b[i]!=0 || temp==0){
				plus += b[i]*(temp/b[i]+1) - temp;
			}
			System.out.println(plus);

		}

		System.out.println(plus);
	}

}
