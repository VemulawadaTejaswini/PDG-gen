import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int d = 0;
			while ( n > 0 ) {
				n = n / k;
				d++;
			}
			
			System.out.println(d);
			
		}
	}
}