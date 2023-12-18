import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
			

		
		
		System.out.println(K*Math.pow(K-1, N-1));
		
		
	}

}