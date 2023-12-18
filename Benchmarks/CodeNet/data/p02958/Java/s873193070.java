import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] p = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				p[i] = sc.nextInt();
			}
			
			int count = 0;
			for(int i = 0 ; i < n ; i++ ) {
				if ( (i+1) == p[i] ) {
					//OK
				}
				else {
					count++;
				}
			}
			
			if ( count < 3 ) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}