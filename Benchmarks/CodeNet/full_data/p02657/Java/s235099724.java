import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int [N];
		int result = 1;

		for(int i=0;i<N;i++) {
			result *= A[i];
		}
		double hantei = result / 1000000000;
		if(hantei > 1000000000) {
			result = -1;
		}

		System.out.println(result);
		stdIn.close();

	}

}
