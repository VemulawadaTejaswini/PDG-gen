import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	//A
	public static void main(String[] args){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if((Math.abs(b - a )<d && Math.abs(c-b)< d)||Math.abs(c-a) < d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	