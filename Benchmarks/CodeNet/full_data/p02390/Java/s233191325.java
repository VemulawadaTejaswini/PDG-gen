import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);

		int a = ac.nextInt();
		ac.close();
		int h = a / 3600;
		int m = ( a % 3600) / 60;
		int s = a % 60;
		
		System.out.println(h + ":" + m + ":" + s);

	}

}

