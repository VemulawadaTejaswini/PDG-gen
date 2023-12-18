import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();

			char[]s = S.toCharArray();

			int N = S.length()+1;
			int []a = new int[N];


			for(int i = 0;i<N-1;i++) {
				if(s[i]=='<') {
					a[i+1] = Math.max(a[i+1], a[i]+1);
				}
			}

			for(int i = N-2;i>=0;i--) {
				if(s[i]=='>') {
					a[i] = Math.max(a[i], a[i+1]+1);
				}
			}

			long goukei = 0;

			for(int i = 0;i<N;i++) {
				goukei+=a[i];
			}

			System.out.println(goukei);










		}


	}


}
