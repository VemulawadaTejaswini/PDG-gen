import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		boolean C = true; 
		String R = "";
		
		while(C){
			N %= 10;
			C = false;
		}
		
		if((N == 2) || (N == 4) || (N == 5) || (N == 7) || (N ==9)){
			R += "hon";
		}
		else if((N == 0) || (N == 1) || (N == 6) || (N == 8)){
			R += "pon";
		}
		else if(N == 3){
			R += "bon";
		}
		System.out.println(R);
		//R = "";
		//C = true;
	}
}