import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(a==1)a=14;
		if(b==1)b=14;
		if(a>b)System.out.println("Alice");
		else if(a<b)System.out.println("Bob");
		else System.out.println("Draw");
	}
}