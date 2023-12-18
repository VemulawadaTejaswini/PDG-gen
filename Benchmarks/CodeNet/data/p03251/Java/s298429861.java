import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		int X = sc.nextInt();

		int Y  = sc.nextInt();

		if(X<Y) {

			int Xmax = sc.nextInt();

			for(int i=1;i<N;i++) {

				int x = sc.nextInt();

				if(Xmax<x) Xmax = x;

			}

			int  Ymin = sc.nextInt();

			for(int i=1;i<M;i++) {

				int y = sc.nextInt();

				if(Ymin>y) Ymin = y;

			}

			if(Xmax<Ymin && Ymin>X) {

				System.out.println("No War");

			}else System.out.println("War");

		}else {

			System.out.println("War");
		}


	}

}
