import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		int window = sc.nextInt();
		int curtain = sc.nextInt();
		
		int opensize = window - (2 * curtain);
		
		if(opensize < 0) {
			System.out.println(0);
		}else {
			System.out.println(opensize);
		}
	}
}