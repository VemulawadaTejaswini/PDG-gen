import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		int sum = 0;

		if(A > K){
			sum += K;
		}else if(A+B >= K){
			sum += A;
		}else{
			K -= A+B;
			sum += (A - K);
		}

		System.out.println(sum);

		scan.close();
	}
}