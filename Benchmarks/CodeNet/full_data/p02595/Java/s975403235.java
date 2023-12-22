import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int D = stdIn.nextInt();
		double X[] = new double[N];
		double Y[] = new double[N];
		double ans = 0;
		int a = 0;
		for(int i = 0; i < N; i++){
			X[i] = stdIn.nextDouble();
			Y[i] = stdIn.nextDouble();
			ans = X[i] * X[i] + Y[i] * Y[i];
			if(Math.sqrt(ans) <= D ){
				a++;
			}
		}
		System.out.println(a);

		stdIn.close();
	}
}