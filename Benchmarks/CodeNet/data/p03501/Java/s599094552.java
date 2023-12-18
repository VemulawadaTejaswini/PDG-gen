import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int fee = 0;

		if(B>A*N) fee = A*N;
		else fee = B;

		System.out.println(fee);
	}
}
