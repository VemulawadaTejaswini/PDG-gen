import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] NAB = sc.nextLine().split(" ");

		int N = Integer.valueOf(NAB[0]);
		int A = Integer.valueOf(NAB[1]);
		int B = Integer.valueOf(NAB[2]);
		int Kei = 0;

		int i = 1;
		do {
			if(A * i + B * i < N) {
				i++;
				continue;
			}

			int Zan = 0;
			int Zan_brue = 0;
			Zan = N - A * (i - 1) - B * (i - 1);
			if(Zan <= A) {
				Zan_brue = Zan;
			}else {
				Zan_brue = A;
			}

			Kei = A * (i - 1) + Zan_brue;

			break;


		}while (i <= N);

		System.out.print(Kei);

	}

}