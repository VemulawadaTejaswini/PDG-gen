import java.util.*;

import java.text.DecimalFormat;


public class Main {

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int a,b;
	String op;



	while(true){
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();
		int c = 0;

	if(op.equals("+")){

		c  = a + b;

	}else if(op.equals("-")){

		c = a - b;

	}else if(op.equals("*")){

		c = a * b;

	}else if(op.equals("/")){

		c = a / b;

	}else if(op.equals("?")){

		break;
	}

	System.out.println(c+ " ");


      }
 }
}