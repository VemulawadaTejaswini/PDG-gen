import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		
		int X = 0;
	 X = (int) ((int)(1900*M+100*(N-M))*Math.pow(2, M));
		
		
		System.out.println(X);
	}
}