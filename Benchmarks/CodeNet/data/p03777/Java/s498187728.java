import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		sc.close();
		
		if(a == b)
			System.out.println("H");
		else
			System.out.println("D");
	}
}
