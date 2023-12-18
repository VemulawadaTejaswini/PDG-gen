import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		double T = t + 0.5;
		int index = 1;
		while(a <= T) {
			a += a * index;
			index++ ;
		}
		
		System.out.println(b*(index-1));
		
	}
}
