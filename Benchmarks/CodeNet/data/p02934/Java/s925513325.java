
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A[] = new double[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextDouble();
		}
		double S = 0.0;
		for(double d : A){
			S += 1.0 / d;
		}
		System.out.println(1.0 / S);
	}
}
