import java.util.Scanner;

public class Main {
	private static Scanner input;
	public static void main(String[] args){
		int i;
		input = new Scanner(System.in);
		int n = input.nextInt();	
		if(n>=3 && n<=1000){
			for(i=3;i<=n;i++){
				if(i%3==0 || i%10-3==0){
					System.out.print(" "+i);
				}	
			}
		}
		 
	 }
}