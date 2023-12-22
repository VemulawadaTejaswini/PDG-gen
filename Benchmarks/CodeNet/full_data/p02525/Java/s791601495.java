import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		while(true){
			int n = sc.nextInt();
			if(n==0){break;}
			int[] scores = new int[n];
			for(i=0; i<scores.length; i++){
				scores[i] = sc.nextInt();
			}
			double average=0, variance=0, sigma=0;
			int sum=0;
			for(i=0; i<scores.length; i++){
				sum = sum+scores[i];
			}
			average=sum/n;
			for(i=0; i<scores.length; i++){
				sigma=sigma+(scores[i]-average)*(scores[i]-average);
			}
			variance=sigma/n;			
			System.out.printf("%.8f", Math.sqrt(variance));
		}
	}
}