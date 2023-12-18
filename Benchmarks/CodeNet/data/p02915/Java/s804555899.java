import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a = N*N*N;
		
		System.out.println(a);
		
		sc.close();	
	}
}