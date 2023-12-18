import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int tap = 0;
		int sasi = 0;
		while (sasi < B){

			if (tap ==0){
				sasi += A;
			} else {
				sasi += (A - 1);
			}
			tap++;
		}
		System.out.println(tap);
	}

}