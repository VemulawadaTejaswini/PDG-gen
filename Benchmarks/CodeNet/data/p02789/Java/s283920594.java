import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		if(scan.nextInt()==scan.nextInt())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
