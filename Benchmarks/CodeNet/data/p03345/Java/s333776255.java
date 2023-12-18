import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();

		long a,b,c;
		for(long n=0;n<K;n++) {
			a=B+C;
			b=A+C;
			c=A+B;
			A=a;
			B=b;
			C=c;
		}
		if(Math.abs(A-B)>1000000000000000000l) {
			System.out.println("Unfair");
		}else {
			System.out.println(A-B);
		}
	}

}
