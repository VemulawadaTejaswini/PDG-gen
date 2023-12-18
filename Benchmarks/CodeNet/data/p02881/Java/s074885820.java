import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		double N=src.nextInt();
		int s=(int)(Math.sqrt((double)N));
		for(int i=s;i>=1;i--) {
			if(N%i==0) {
				System.out.println(i+(int)(N/i)-2);
				break;
			}
		}
		
				
		
		

	}

}
