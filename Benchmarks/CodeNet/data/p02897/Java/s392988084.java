import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double answer;
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		if(N%2 == 0) {
			answer = N/(2*N);
		}else {
			answer = (N+1)/(2*N);
		}
		System.out.println(String.format("%.10f", answer));
	}
}