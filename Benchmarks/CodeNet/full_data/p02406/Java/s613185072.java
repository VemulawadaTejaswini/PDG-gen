import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int n = 1; n <= a; n++){
			int c1 = n % 10;
			int c2 = (n / 10) % 10;
			int c3 = (n / 100) % 10;
			int c4 = (n / 1000);
			if (n%3==0||c1==3||c2==3||c3==3||c4==3){
				System.out.print(" " + n);
			}
		}
		System.out.println("");
		
		sc.close();
	}
}

