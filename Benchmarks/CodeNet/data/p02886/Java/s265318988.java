import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] d = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				d[i] = sc.nextInt();
			}
			
			int result = 0;
			
			for(int i = 0 ; i < n ; i++ ) {
				for(int j = i+1 ; j < n ;j++ ) {
					result += d[i] * d[j];
				}
			}
			
			
			System.out.println(result);
			
		}
	}
}

