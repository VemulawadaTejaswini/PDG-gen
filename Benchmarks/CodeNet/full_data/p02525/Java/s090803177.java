import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int Sum1=0;
			double Sum2=0;
			int n = sc.nextInt();
		if (n == 0) { break; }
		int[] scores = new int[n];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			}
		double average = 0, variance = 0;
		for (int i = 0; i < scores.length; i++) {
			Sum1 = Sum1 + scores[i];
			}
		average = (double)Sum1/n;
		for (int i = 0; i < scores.length; i++) {
			Sum2 = Sum2 +(scores[i]-average)*(scores[i]-average);
			}
		variance = Sum2/n;
		System.out.println(Math.sqrt(variance)); 
		}
		}
}