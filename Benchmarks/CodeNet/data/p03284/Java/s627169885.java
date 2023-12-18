import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		scan.close();
		
		System.out.print(N % K == 0 ? "0" : "1"); 
	}
}