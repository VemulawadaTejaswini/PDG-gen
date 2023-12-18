
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();

		String[] numbers = num.split(" ");
		int A = Integer.parseInt(numbers[0]);
		int B = Integer.parseInt(numbers[1]);
		int N = Integer.parseInt(numbers[2]);


//		for(int x = 0; x<=N; x++) {
//			double c = Math.floor(A*x/B)-A*Math.floor(x/B);
//		}
		double x;
		if(N<B) {
			x=N;
		}else if(N%B!=0) {
		//nがbの倍数でない場合
			x=B*Math.floor(N/B);
		}else {
			x=N-1;
		}

		double c = Math.floor(A*x/B)-A*Math.floor(x/B);

		System.out.println((int)c);
	}
}