import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A,B,C,K;
		A=sc.nextLong();
		B=sc.nextLong();
		C=sc.nextLong();
		K=sc.nextLong();
		long max=A;
		if(A>=K) {
			max=A;
		}else if(A+B>=K) {
			max=A;
		}else if(A+B+C>=K) {
			max=A-(K-A-B);
		}
		System.out.println(max);
		
	}
}

