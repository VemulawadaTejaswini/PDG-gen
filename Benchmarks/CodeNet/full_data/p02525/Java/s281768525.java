import java.util.Scanner;

public class Main {
	public static void main(System[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[] scores = new int[n];
			for(int i =0;i<scores.length;i++){
				scores[i] = sc.nextInt();
			}
			double average = 0;
			int variance = 0;
			for(int i =0;i<n;i++){
				average += scores[i];
			}
			average /=n;
			for(int i =0;i<n;i++){
				variance += Math.pow(scores[i]-average,2);
			}
			variance /=2;
		}
		System.out.println(Math.sqrt(variance));
	}
}