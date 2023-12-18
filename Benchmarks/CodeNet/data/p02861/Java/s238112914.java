import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];

		for(int i=0; i<N; i++) {
			sc.nextLine();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
//			System.out.println(x[i] + ":" + y[i]);
		}

		double sumDist = 0;

		for (int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++)
				sumDist += calcDistance(x[i],y[i],x[j],y[j]);
		}

		int C = Factrial(N) / Combi(N,2) ;

		double sumDist2 = (sumDist * C * (N-1))/Factrial(N);

		System.out.println(sumDist2);

	}


	public static double calcDistance(int x1, int y1, int x2, int y2) {

		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) ;
	}

	public static int Factrial(int n) {
		int Sum = 1;
		for (int i=1; i<=n; i++) {
			Sum *= i;
		}
		return Sum;
	}

	public static int Combi(int a, int b) {
		int C=1;
		for(int i=a; i>(a-b); i--)
			C *= i;
		return C / Factrial(b);
	}

}