import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		if(X < 30)		System.out.println("No");
		else				System.out.println("Yes");
		sc.close();
	}
}
