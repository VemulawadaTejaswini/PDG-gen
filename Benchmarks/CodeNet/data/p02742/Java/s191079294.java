import java.util.*;
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		
		int masu = H*W;
		
		if(masu%2==0){
			System.out.println(masu/2);
		}
		else{
			System.out.println(masu/2+1);
		}
	}
}