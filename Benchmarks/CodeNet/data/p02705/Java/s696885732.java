import java.util.Scanner;

public class  Main{
	public static void main(String[] args) {
		double r;
		double area;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("半径 ");
		r = scanner.nextDouble();
		
		area = r * 3.14 * 2;
		
		System.out.println("周長 " + area);
	}
}