import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n,sum=0;
		double average,variance=0;
		while (true){
			n =sc.nextInt();
			if (n==0){break;}
			int[] scores=new int[n];
			for(int i=0; i<scores.length; i++){
				scores[i]=sc.nextInt();
				sum=sum + scores[i];
				}

			average= sum / scores.length;
			for(int i=0; i<n; i++){
				variance= variance + ((scores[i]-average)*(scores[i]-average)); 
			}
						
			System.out.println(Math.sqrt(variance/n));
			}
	}
}