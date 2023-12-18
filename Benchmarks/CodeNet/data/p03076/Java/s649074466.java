

import java.util.Scanner;

public class Main {
	public static void main (String[]args){
		Scanner teclado = new Scanner (System.in);		
				int A, B, C, D, E;
				A=teclado.nextInt();
				B=teclado.nextInt();
				C=teclado.nextInt();
				D=teclado.nextInt();
				E=teclado.nextInt();
			do {
				if(A % 10!=0) 
					A +=1;
				if(B%10!=0)
					B+=1;
				if(C%10!=0)
					C+=1;
				if(D%10!=0)
					D+=1;
				if(E%10!=0)
					E+=1;
			 
			 }while(A%10!=0 && B%10!=0 && C%10!=0 && D%10!=0 && E%10!=0 );
			 int soma = A+B+C+D+E;
			 System.out.println(soma+1);
		}}

