import java.util.Scanner;

public class main{
	public static void main(string[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){break;}
			int[] scores =new int[n];
			for(int i = 0;i<scores.length; i++){
				scores[i] = sc.nextInt();
			}
			double average =0, variance =0;
			for(int i=0; i<scores.length; i++){
				average += scores[i];
			}
			average= average/n;
			for(int i=0; i<scores.length; i++){
			variance += Math.pow((scores[i]-average),2);	
			}
			variance = variance/n;


			System.out.println(Math.sqrt(variance));
		}		
	}
}