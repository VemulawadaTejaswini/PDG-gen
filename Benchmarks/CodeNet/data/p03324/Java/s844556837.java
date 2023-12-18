import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		
		if (D == 0 && N < 100) {
			System.out.println(N);
		} else if (D == 0 && N == 100) {
			System.out.println(101);
		} else if (D == 1 && N == 100) {
			System.out.println(100 * 101);
		} else if (D == 1) {
			System.out.println(100 * N);
		} else if (D == 2 && N == 100) {
			System.out.println(100 * 100 * 101);
		} else if (D == 2) {
			System.out.println(100 * 100 * N);
		}
	}
	
}