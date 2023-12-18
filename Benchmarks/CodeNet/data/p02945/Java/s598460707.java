import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = 0;
		
		while(A>=-100&&A<=100&&B>=-100&&B<=100){
		
		if(A+B>A-B&&A+B>A*B){
			C=A+B;
		}
		else if(A-B>A+B&&A-B>A*B) {
			C=A-B;
		}
		else if(A*B>A+B&&A*B>A-B){
			C=A*B;
		}
		System.out.print(C+"\nThe largest number among A+B="+(A+B)+", A−B="+(A-B)+", and A×B="+A*B+" is "+C+".");
}
}
}