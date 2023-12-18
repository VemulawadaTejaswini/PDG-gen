import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		int b = sc.nextInt();
		int T = sc.nextInt();
		
		int index = 1;
		while(a <= T) {
			a = a * index + 0.5;
			index++ ;
		}
		
		System.out.println(b*(index-1));
		
	}
}
