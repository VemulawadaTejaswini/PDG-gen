import java.io.IOException;
import java.util.Scanner;

public class mofu {

	public static void main(String[] args) throws IOException {
			
	   Scanner sc = new Scanner(System.in);
	   int S = sc.nextInt();
	  
	   System.out.println(S%60);
	   System.out.println((S%60)%60);
		
	}
}