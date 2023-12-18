import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		for(int i = 0;i < N;i++){
			p[i] = sc.nextDouble();
		}
		sc.close();
		double max = 0;
		for(int i = 0;i <= N-K;i++){
			double num = 0;
			for(int j = i;j < i+K;j++){
				num += 0.5+0.5*p[j];
			}
			max = Math.max(max, num);
		}
		System.out.println(max);
	}
}