import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			int[] cells = new int[n];

			for(int i = 0 ; i < n ; i++ ) {
				cells[i] = sc.nextInt();
			}
			
			int rightHeight = cells[n-1];
			for(int i = 1 ; i < n ; i++ ) {
				//right to left
				int current = cells[n-i-1];
				if ( current == rightHeight ||  current - 1 == rightHeight ) {
					//ok
				}
				else if ( current < rightHeight ) {
					rightHeight = current;
				}
				else {
					System.out.println("No");
					return;
				}
			}
			
			System.out.println("Yes");
		}
	}
}
