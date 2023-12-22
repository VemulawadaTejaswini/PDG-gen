import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		
		int N = n.nextInt();
		
		if(N >= 100) {
			N = N % 100;
		}
		
		if(N >= 10) {
			N = N % 10;
		}
		
		if(N == 2 || N == 4 || N == 5 || N == 7 || N == 9) {
			System.out.println("hon");
			
		}else if(N == 0 || N == 1 || N == 6 || N == 8) {
			System.out.println("pon");
			
		}else {
			System.out.println("bon");
		}
	}
}
