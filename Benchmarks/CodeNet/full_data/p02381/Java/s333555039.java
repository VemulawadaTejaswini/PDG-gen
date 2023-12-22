import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int n = sc.nextInt();
				if(n == 0){
					break;
				}
				int[] scores = new int[n];
				int sum = 0;
				for(int i = 0;i < scores.length;i++){
					scores[i] = sc.nextInt();
					sum = sum + scores[i];
				}
				double average = 0,variance = 0,stdev=0;
				average = sum / scores.length;
				for(int j = 0;j < scores.length;j++){
					variance += ((scores[j]-average)*(scores[j]-average));
				}
				System.out.println(Math.sqrt(variance/scores.length));
			}
		}
	}
}
