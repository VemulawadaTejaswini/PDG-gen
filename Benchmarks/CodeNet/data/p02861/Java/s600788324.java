import java.util.Scanner;

// https://atcoder.jp/contests/abc145/tasks/abc145_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double[] arrayX = new double[N];
		double[] arrayY = new double[N];
		for(int i=0;i<N;i++) {
			arrayX[i] = sc.nextDouble();
			arrayY[i] = sc.nextDouble();
		}
		sc.close();


//		int combination = 1;
//		for(int i=1;i<=N;i++) {
//			combination=combination*i;
//		}

		double d = 0.0;

		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				d = d + Math.sqrt(Math.pow(arrayX[i] - arrayX[j],2) + Math.pow(arrayY[i] - arrayY[j],2));
			}
		}
		System.out.println(2*d/N);




	}
}
