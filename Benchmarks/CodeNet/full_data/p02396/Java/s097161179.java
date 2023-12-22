import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int i = scan.nextInt();
		int x = 1;
		while(1!=0){
			System.out.println("case "+x+": "+i);
			x++;
			i = scan.nextInt();
		}
	}
}