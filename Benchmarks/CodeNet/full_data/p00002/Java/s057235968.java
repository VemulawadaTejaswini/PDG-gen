import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		int sum = a+b;
		int valLen = String.valueOf(sum).length();
		System.out.println(valLen);
		}

	}

}
