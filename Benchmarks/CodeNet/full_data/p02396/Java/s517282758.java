import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){

		int i = 1;
		
		while (true){
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
		
			if (a == 0)
				break;
		
			System.out.println("Case " + i + ": " + a);
			i++;
		}
	}
}