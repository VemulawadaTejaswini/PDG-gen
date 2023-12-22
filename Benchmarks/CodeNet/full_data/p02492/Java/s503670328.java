import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int a,b,answer=0;

	String op;

	Scanner sc = new Scanner(System.in);

	while(true){

		a = sc.nextInt();

		op = sc.next();

		b = sc.nextInt();

		if(op.equals("+")){

			answer = a+b;

		}else if(op.equals("-")){

			answer = a-b;

		}else if(op.equals("/")){

			answer = a/b;

		}else if(op.equals("*")){

			answer = a*b;

		}else if(op.equals("?")){

			break;

		}

		System.out.println(answer);

	} 

}

}