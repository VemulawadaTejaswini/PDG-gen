import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			StringBuilder S = new StringBuilder(scan.nextLine());
			
			S.insert(4, " ");

			System.out.println(S.toString());
		}
	}
}
