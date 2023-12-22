import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int table = stdin.nextInt();
		int chairs = stdin.nextInt();
		System.out.println(table * chairs);
	}

}