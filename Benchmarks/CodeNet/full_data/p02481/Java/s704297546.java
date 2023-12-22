import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x,y,area,length;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		area = x * y;
		length = x * 2 + y * 2;
	    System.out.println(area + " " + length);
	}
}