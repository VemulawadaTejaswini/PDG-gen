import java.util.Scanner;
import java.math.*;

class Main{

    public static void main(String[] args){

	int N,o;

	Scanner in = new Scanner(System.in);
	N = in.nextInt();
	BigDecimal x = new BigDecimal("0.0");	

	for(int i = 0; i<N; i++){
	    o = in.nextInt();
	    BigInteger a = in.nextBigInteger();
	    BigDecimal y = new BigDecimal(a);
	   

	    if(o == 1){
		x = x.add(y);
	
	    }
	    else if(o == 2){
		x = x.subtract(y);
		//	System.out.println(x.toString());
	    }
	    else if(o == 3){
		x = x.multiply(y);
		//System.out.println(x.toString());
	    }
	    else if(o == 4){
		x = x.divide(y);
	    }
	    
	}
	BigInteger as = x.toBigInteger(); 

	System.out.println(as);
       return 0;
    }

}