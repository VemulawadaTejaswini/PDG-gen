import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
	Scanner teclado = new Scanner (System.in) ;		
	int A, B, T;
	A = teclado.nextInt();
	B = teclado.nextInt();
	T = teclado.nextInt();
	
	if(A < B && T+0.5 <=20 && T+0.5 > B && A*2 <T+0.5) {
		System.out.println(B*2);
	}else if (B < A && T+0.5 <=20 && T+0.5 > B && A*2 <T+0.5) {
		System.out.println(A*2);
	}else if( T+0.5 < B || A==B ){
		System.out.println(0);
	}
	
}}