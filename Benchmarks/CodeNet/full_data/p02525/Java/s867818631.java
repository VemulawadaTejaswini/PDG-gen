import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		int n = sc.nextInt();
		if(n == 0){ break; }
		int[] scores = new int[n];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			}
		double average = 0, variance = 0,a = 0;
		for(int i =0; i<scores.length;i++){
		average += scores[i];
		}
		average = average/n;
		for(int i=0;i<scores.length;i++){
		a += (scores[i]-average)*(scores[i]-average);
		}
		variance = a/n;
		System.out.println(Math.sqrt(variance));
		}
	}
}