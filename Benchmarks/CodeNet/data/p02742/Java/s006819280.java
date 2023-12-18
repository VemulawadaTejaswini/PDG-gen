import java.util.*;
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long H = scan.nextInt();
		long W = scan.nextInt();
		
		long masu = H*W;
		
		long masuno = masu/2;
		
		if(masu%2==0){
			System.out.println(masuno);
		}
		else{
			System.out.println(masuno+1);
		}
	}
}