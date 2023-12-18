import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int a =Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		sc.close();

		if (a+b>a-b && a+b>a*b)
			System.out.println(a+b);
		else if (a-b>a+b && a-b>a*b)
			System.out.println(a-b);
		else
			System.out.println(a*b);
	}
}
