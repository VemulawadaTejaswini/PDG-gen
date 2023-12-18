import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		int width = scan.nextInt();
		int height = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double area = (width * height) / 2;
		System.out.print(area + " ");
		
		if(x + x == width && y + y == height){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
	}
}