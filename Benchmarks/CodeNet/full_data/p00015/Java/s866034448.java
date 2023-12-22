import java.io.*;
import java.math.*;
import java.util.Scanner;

class Test{
    public static void main(String args[]){
	BigInteger a,b,n;
	int c;
	n=BigInteger.TEN.pow(81);
	Scanner scan = new Scanner(System.in);
	c=scan.nextInt();
	for(int i=0; i<c; i++){
	    a= new BigInteger(scan.next());
	    b= new BigInteger(scan.next());
	    if((a.add(b)).compareTo(n) == 1){
		System.out.println("overflow\n");
	    }else{
		System.out.println(a.add(b));
	    }
	}
    }
}