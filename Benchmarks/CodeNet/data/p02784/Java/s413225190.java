import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++){
			h -= scan.nextInt(); 
		}
		
		System.out.println(h <= 0 ? "Yes" : "No");
		
	}
}