import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner kbScanner = new Scanner(System.in);
		int longth = kbScanner.nextInt();
		int side = kbScanner.nextInt();
		
		int area = longth * side;
		int length = 2 * (longth + side);
		System.out.println(area + " " + length);
	}
}