import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
		int[] scores = new int[n];
		for (int i=0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		double average = 0, variance = 0, sum = 0;
		int a, b;
		for (a=0; a<scores.length; a++) {
			sum += scores[a];
		}
		average = sum / n;
		for (b=0; b<scores.length; b++) {
			variance += (scores[b]-average) * (scores[b]-average) / n;
		}
		System.out.println(Math.sqrt(variance));
	}
	}
}