import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
int A=N/100;
int B=N-A*100;

	if(A<=12&&0<A) {
		if(B<=12&&0<B) {
			System.out.print("AMBIGUOUS"); 	
			
		}else {
			
			System.out.print("MMYY"); 	
			
		}
	}else {
		if(B<=12&&0<B) {
			System.out.print("YYMM"); 	
			
		
	}else {
System.out.print("NA"); 	
			
	}

	}
}
}

