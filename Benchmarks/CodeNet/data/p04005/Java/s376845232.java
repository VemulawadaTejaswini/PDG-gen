import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double output;
		//System.out.println((A%2)+","+(B%2)+","+(C%2));
		if((A%2==0)||(B%2==0)||(C%2==0)){
			System.out.println(0);
			return;
		}
		double MAX = Math.max(Math.max(A, B),C);
		double MIN = Math.min(Math.min(A, B), C);
		double mod = MAX % 2;
		double MID;
		if(A==MAX){
			if(B>C){
				MID = B;
			}else{
				MID = C;
			}
			output = mod * MID * MIN;
		}else if(B==MAX){
			if(A>C){
				MID = A;
			}else{
				MID = C;
			}
			output = mod * MID * MIN;
		}else{
			if(A>B){
				MID = A;
			}else{
				MID = B;
			}
			output = mod * MID * MIN;
		}
		//System.out.println(MAX+","+MID+","+MIN);
		System.out.println((int)output);

	}
}