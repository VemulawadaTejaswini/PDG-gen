import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		for(long i=0; i<K; i++) {
			if(A>0) {
				A--;
			}else if(B>0) {
				B--;
			}
		}
		System.out.println(A + " " + B);
	}

}