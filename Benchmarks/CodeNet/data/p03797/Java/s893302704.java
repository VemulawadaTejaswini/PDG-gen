import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int rest = 0;
		
		if(M > 2*N){
			rest = M - 2 * N;
		}
		
		int quo = rest / 4;
		
		System.out.println(N + quo);
	}

}