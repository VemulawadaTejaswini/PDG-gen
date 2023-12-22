import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		for (int i=0;i<100;i++) {
			for (int j=0;j<100;j++) {
				if (i*4+j*2==Y&&i+j==X) {
					System.out.println("Yes");
					return ;
				}
			}
		}

		System.out.println("No");
	}
}