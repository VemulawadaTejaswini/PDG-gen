import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();

		//int Tak = 0;
		//int Aok = 0;
		for(long i=0;i<K;i++) {
			if(A>0) {
				A--;
			}else B--;


		}
		System.out.println(A);
		System.out.println(B);
	}

}
