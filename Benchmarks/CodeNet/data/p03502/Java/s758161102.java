import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		while(N > 0) {
			sum = sum + N % 10;
			N = N  / 10; 
		}
		if(N % sum == 0) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		sc.close();
	}
}
