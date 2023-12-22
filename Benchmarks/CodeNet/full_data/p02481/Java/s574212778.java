import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int menseki = x* y;
		int shuu = x + x + y + y;
		System.out.println(menseki + " " + shuu);
	}
}