import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String [] args){
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int [] o = new int [n];
	int [] y = new int [n];

	BigInteger x = new BigInteger("0");
	BigInteger p = new BigInteger("4294967299");
	// BigInteger p = new BigInteger("1000000007");
	BigInteger d = new BigInteger("2147483648");

	for(int i = 0; i < n; ++i){
	    o[i] = in.nextInt();
	    y[i] = in.nextInt();
	}

	for(int i = 0; i < n; ++i){
	    int oo = o[i];
	    BigInteger yy = new BigInteger(String.valueOf(y[i]));

	    if(oo == 1){ // +
		x = x.add(yy);
	    }else if(oo == 2){ // -
		x = x.subtract(yy);
	    }else if(oo == 3){ // *
		x = x.multiply(yy);
	    }else if(oo == 4){ // /
		// x = x.multiply(yy.modPow(p.subtract(new BigInteger("2")), p));
		x = x.multiply(yy.modInverse(p));
	    }
	    x = x.mod(p);
	}

	if(x.compareTo(d) == -1)
	    System.out.println(x);
	else
	    System.out.println(x.subtract(p));
    }
}