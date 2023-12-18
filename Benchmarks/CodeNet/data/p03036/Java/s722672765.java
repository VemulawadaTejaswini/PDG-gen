import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();
		
		for (int i =0; i<10; i++) {
			int a = r*x-d;
			System.out.println(r*x-d);
			x=a;
			
		}

	}
}