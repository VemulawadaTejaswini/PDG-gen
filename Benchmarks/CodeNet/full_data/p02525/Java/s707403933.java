import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while (true) {
		int n = sc.nextInt();
		if (n == 0) { break; }
		int[] scores = new int[n];
		for (int i = 0; i < scores.length; i++) {
		scores[i] = sc.nextInt(); 
		}
		double average = 0, variance = 0;
		for (int i = 0; i < n; i++) {
		average+=scores[i]/n;
		}
		for (int i = 0; i < n; i++) {
		variance+=Math.pow(scores[i]-average,2)/n;
		}
        System.out.println(Math.sqrt(variance));
		} }
		}