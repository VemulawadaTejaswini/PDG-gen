import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		System.out.println((row * col) - ((col * h) + (row * w) - (h*w)));
	}
}
