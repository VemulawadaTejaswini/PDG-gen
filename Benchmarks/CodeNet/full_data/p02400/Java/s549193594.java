import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

class Main{
public static void main(String[] args){

	Scanner s = new Scanner(System.in);
    int a=s.nextInt();	
    int b=s.nextInt();
   // double c= (double)a/(double)b;
       
   System.out.println(a+b+floatingDiv(a,b));
	}
	private static Bigdecimal floata(int a,int b){

	    Bigdecimal num1 = new Bigdecimal((double)a);
	    Bigdecimal num2 = new Bigdecimal((double)b);
	     return num1.divide(num2,Mathcontext.DECIMAL32);
	}

}
