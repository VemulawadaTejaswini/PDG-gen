import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
		
			int n = sc.nextInt();
			int[] as = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				as[i] = sc.nextInt();
			}
			
			int cn = 1;
			int bc = 0;
			
			for(int i = 0 ; i < n ; i++ ) {
				if ( as[i] == cn) {
					//satisfied
					cn++;
				}
				else {
					//break it
					bc++;
				}
			}
			
			if ( cn == 1 ) {
				System.out.println(-1);
			}
			else {
				System.out.println(bc);
			}

		}
	}

}