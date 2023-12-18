import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A,B;
		do {
		A = stdIn.nextInt();
		B = stdIn.nextInt();
		}while(A<1||A>100000||B<1||B>100000||A==B);
		
		if(A<B) {
			int t = A;
			A = B;
			B = t;
		}
		long kai = 0;
		int hantei =0;
		for(int i=1 ; i<100000 ; i++ ) {
			kai = A*i;
			if(kai%B==0) {
				break;
			}
		}
		System.out.println(kai);
	}
}
