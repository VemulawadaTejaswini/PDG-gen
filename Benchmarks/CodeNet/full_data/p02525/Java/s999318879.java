import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[] score = new int[n];
			int i=0;
			for(i=0;i<score.length;i++){
				score[i]=sc.nextInt();
			}
			double average=0, variance=0;
			int sum=0;
			for(i=0;i<score.length;i++){
				sum=sum+score[i];
			}
			average=(double)sum/n;
			double sum2=0;
			for(i=0;i<score.length;i++){
				sum2=(double)sum2+(score[i]-average)*(score[i]-average);
			}
			variance=(double)sum2/n;
			System.out.println(Math.sqrt(variance));
		}
	}
}