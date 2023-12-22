/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long n=sc.nextLong();
	    primes(n);
	}
	
	static void primes(long n){
	    int ans=0;
	    long m=n;
	    boolean prime=true;
	    for(long i=2;i*i<=m;i++){
	        if(n%i==0){
	            n/=i;
	            ans++;
	            prime=false;
	        }
	    }
	    if(n!=0)ans=0;
	    if((long)Math.pow((long)Math.sqrt(m),2)==m)ans=0;
	    if(prime)ans=1;
	    System.out.println(ans);
	}
	
}
