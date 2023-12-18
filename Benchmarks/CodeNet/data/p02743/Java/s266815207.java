import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		String[] abc= sn.nextLine().split(" ");

		sn.close();
		double a = Math.sqrt(Integer.valueOf(abc[0]));
		double b = Math.sqrt(Integer.valueOf(abc[1]));
		double c = Math.sqrt(Integer.valueOf(abc[2]));

		if(a + b < c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}