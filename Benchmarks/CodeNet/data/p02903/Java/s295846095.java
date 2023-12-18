import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(h*a != w*b) {
			System.out.println("No");
			
		}
		
		
		in.close();

	}

}