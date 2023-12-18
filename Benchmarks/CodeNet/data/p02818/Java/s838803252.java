import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long a,b;
		if(K<=A) {
			a=A-K;
			b=B;
		}else if(A<K && K<= (A+B)) {
			a=0;
			b=B-K+A;
		}else {
			a=0;
			b=0;
		}
		System.out.println(a+" "+b);
	}

}
