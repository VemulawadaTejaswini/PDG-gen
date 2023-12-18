import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a<=8 && b<=8) System.out.println("Yay!");
		else System.out.println(":(");

	}

}
