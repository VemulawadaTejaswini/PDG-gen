import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (true){
			int n = sc.nextInt();
			if(n == 0){break;}
			int[] scores = new int[n];
			int sum=0;
			for (int i = 0;i<scores.length;i++){
				scores[i]=sc.nextInt();
				sum = sum + scores[i];
			}
			double average = 0,variance = 0;
			average = sum/n;
			for (int i = 0;i<scores.length;i++){
			variance = (scores[i]-average)*(scores[i]-average)/n;
			}
			
			System.out.println("%.8f",Math.sqrt(variance));
	}}