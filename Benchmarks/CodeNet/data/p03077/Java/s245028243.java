import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a[] = new long[6];
		long mina = -5;
		for (int i = 1; i <= 5; i++) {
			a[i] = sc.nextInt();

		}
		mina = a[1];
		for (int i = 1; i <= 5; i++) {

			if (mina > a[i]) {
				mina = a[i];
			}
		}


		if(n%mina!=0){
			n=n+(mina-n%mina);
		}
System.out.println(n/mina+4);

	}
}