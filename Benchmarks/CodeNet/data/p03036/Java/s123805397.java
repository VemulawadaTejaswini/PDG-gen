import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int  r = sc.nextInt();
		int  D = sc.nextInt();
		int  X = sc.nextInt();
		
		int X_1 = r * X - D;
		int X_2 = r * X_1 - D;
		int X_3 = r * X_2 - D;
		int X_4 = r * X_3 - D;
		int X_5 = r * X_4 - D;
		int X_6 = r * X_5 - D;
		int X_7 = r * X_6 - D;
		int X_8 = r * X_7 - D;
		int X_9 = r * X_8 - D;
		int X_11 = r * X_9 - D;
		
		System.out.println(X_1);
		System.out.println(X_2);
		System.out.println(X_3);
		System.out.println(X_4);
		System.out.println(X_5);
		System.out.println(X_6);
		System.out.println(X_7);
		System.out.println(X_8);
		System.out.println(X_9);
		System.out.println(X_11);
	}
	
}