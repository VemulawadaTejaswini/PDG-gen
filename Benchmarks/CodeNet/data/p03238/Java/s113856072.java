import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n==1) System.out.println("Hello World");
		else System.out.println(scan.nextInt()+scan.nextInt());
	}

}