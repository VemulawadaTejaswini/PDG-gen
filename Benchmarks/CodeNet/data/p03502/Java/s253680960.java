import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String Ns = String.valueOf(N);
		
		int f = 0;
		
		for(int i = 0; i < Ns.length(); i++) {
			f += N / (int)Math.pow(10, i) % 10;
		}
		if(N % f == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
