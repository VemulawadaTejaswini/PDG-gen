import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];

		for (int i=0; i<N; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int keiro = 1;
		for (int i=1; i<=N; i++){
			keiro *= i;
		}
		int kyoriCase = 0;
		for (int i=1; i<N; i++){
			kyoriCase += i;
		}
		int jyufuku = (keiro * (N-1)) / kyoriCase;

		double kyori=0;
		for (int i=0; i<N; i++){
			for (int j= i+1; j<N; j++){
				kyori += Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2));
			}
		}

		System.out.println((jyufuku * kyori) / keiro);
	}
}