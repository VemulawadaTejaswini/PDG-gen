import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int result = 0;

		if(A>0) {
			if(A>=K) {
				result=K;
			}else {
				result=A;
			}
			K = K - A;
		}
		if(K>0 && B>0) {
			K = K - B;
		}
		if(K>0 && C>0) {
			if(C>=K) {
				result =result + K*-1;
			}else {
				result = result + A*-1;
			}
		}
		System.out.println(result);

	}
}