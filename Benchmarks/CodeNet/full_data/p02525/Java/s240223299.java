import java.util.Scanner;

public class Main11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[] scores = new int[n];
			for(int i=0; i<scores.length; i++){
				scores[i] = sc.nextInt();
			}
			double ave = 0, var = 0;
			int sum = 0;
			
			for(int i=0; i<n; i++){
				sum += scores[i];
			}
			ave = sum / n;
			
			double sum2 = 0;
			for(int i=0; i<n; i++){
				sum2 += (scores[i] - ave)*(scores[i] - ave);
			}
			var = sum2 / n;
			
			System.out.println(Math.sqrt(var));
			
			
		}
	}
}