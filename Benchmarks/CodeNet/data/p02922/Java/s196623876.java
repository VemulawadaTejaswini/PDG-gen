import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		


		Scanner in = new Scanner(System.in);
		double noSocketsPer= in.nextDouble();//x
		double proSockets= in.nextDouble();//y
		int count=0;
		int counter=0;
		if(noSocketsPer>=proSockets)
System.out.print(1);		
		while(count<(proSockets-noSocketsPer)) {
			count+=(noSocketsPer-1);
			counter++;	
		}
		count+=noSocketsPer;
			 
			System.out.print(++counter);	
}
}