import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		float output;
		if((A%2==0)||(B%2==0)||(C%2==0)){
			System.out.println(0);
			return;
		}
		float MAX = Math.max(Math.max(A, B),C);
		float MIN = Math.min(Math.min(A, B), C);
		float mod = MAX % 2;
		float MID;
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
		System.out.println((int)output);

	}
}