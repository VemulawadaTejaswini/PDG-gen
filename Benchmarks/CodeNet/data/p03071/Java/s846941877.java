import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = 0;
		if(A > B){
		X = A + (A - 1);
		}
		if(A == B){
			X = A + B;
		}
    	if(A < B){
    	X =	B + (B - 1);
		}
		System.out.println(X);
	}
}	
		