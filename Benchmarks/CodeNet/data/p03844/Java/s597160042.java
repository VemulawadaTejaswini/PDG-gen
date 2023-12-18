import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int a,b, val;
		String op;
		String plus = "+";	
		a = Integer.parseInt(args[0]);
		op = args[1];
		b = Integer.parseInt(args[2]);

		if(op.equals(plus)){
			val = a + b;
		}else{
			val = a - b;
		}
		System.out.println(op);
		System.out.println(val);
	}
}

