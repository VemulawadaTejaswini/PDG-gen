import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 1; i < 1100;i++ ) {
			int eight = i * 8 /100;
			int ten = i * 10 /100;
			if(eight ==a && ten == b) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}