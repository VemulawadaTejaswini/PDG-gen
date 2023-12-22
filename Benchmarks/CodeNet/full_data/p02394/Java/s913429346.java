import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int h = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		String result = "Yes";
		if (x - r < 0 || y - r < 0) {
			result = "No";
		} 
		
		if (x + r > w || y + r > h) {
			result = "No";
		}
		
		System.out.println(result);
	}

}

