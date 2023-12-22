import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){ break; }
			int[] scores = new int[n];
			double sum = 0;
			for(int i = 0; i < scores.length; i++){
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
		double average = 0, variance = 0, temp = 0;
		average = sum / n;
		for(int j = 0; j < n; j++){
			temp += (scores[j] - average) * (scores[j] - average);
		}
		variance = temp / n;
		System.out.printf("%.8f\n", Math.sqrt(variance));
		}
	}
}