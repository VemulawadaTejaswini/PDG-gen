import java.util.*;
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		
		int masu = H*W;
		
		int masuno = masu/2;
		
		if(H==1 || W==1){
			System.out.println(1);
		}
		else{
		
		
		if(masu%2==0){
			System.out.println(masuno/2);
		}
		else{
			System.out.println(masuno/2+1);
		}
		}
	}
}