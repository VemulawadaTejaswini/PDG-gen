import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i = 3; i <= a; i++) {
			if (i%3 == 0 || i%10 == 3)
//				if(i == a)System.out.print(i);
//				else System.out.print(" " + i);
				System.out.print(" " + i);
		}

		System.out.println();
	}

}