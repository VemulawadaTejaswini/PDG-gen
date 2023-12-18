import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			if(M < (2 * N)){
				System.out.println(M/2);
				return;
			}
			
			int ans = N + ((M - (2 * N)) / 4);
			System.out.println(ans);
		}
	}
}
