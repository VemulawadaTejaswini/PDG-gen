import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
    	int n;
    	n=s.nextInt();
    	for(int i=0;i<n;i++){
    		BigInteger a=s.nextBigInteger().add(s.nextBigInteger());
    		if(a.toString().length()>80) System.out.println("overflow");
    		else System.out.println(a.toString());
    	}
    }
}
//by Tuvshee 12.05.2012
//National budget