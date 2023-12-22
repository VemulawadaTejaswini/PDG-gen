import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		for(int i = 0; i < c; i++){
			int sum = 0;
			int a = scan.nextInt();
			System.out.print(a);
			sum += a;
			for(int j = 1; j < r; j++){
				a = scan.nextInt();
				System.out.print(" " + a);
				sum += a;
			}System.out.println(" " + sum);
		}

	}

}